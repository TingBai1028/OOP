package unsw.business;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class BusinessRuleMain {
    /**
     * Loads a resource file given a certain path that is relative to resources/
     * for example `/dungeons/maze.json`. Will add a `/` prefix to path if it's not
     * specified.
     *
     * @precondition path exists as a file
     * @param path Relative to resources/ will add an implicit `/` prefix if not
     *             given.
     * @return The textual content of the given file.
     * @throws IOException If some other IO exception.
     */
    public static String loadResourceFile(String path) throws IOException {
        if (!path.startsWith("/"))
            path = "/" + path;
        return new String(BusinessRuleMain.class.getResourceAsStream(path).readAllBytes());
    }

    public static BusinessOperator createOperator(JSONObject obj) {
        String operator = obj.getString("Operator");

        switch (operator) {
        case "CONSTANT":
            return new ConstantBusinessOperator(obj.getNumber("Arg"));
        case "LOOKUP":
            return new LookUpBusinessOperator(obj.getString("Arg"));
        default:
            return null;
        }
    }

    public static BusinessRule createRule(JSONObject obj) {
        String operator = obj.getString("Operator");

        switch (operator) {
        case "AND":
            JSONArray args = obj.getJSONArray("Args");
            JSONObject obj1 = args.getJSONObject(0);
            JSONObject obj2 = args.getJSONObject(1);
            return new AndBusinessRule(createRule(obj1), createRule(obj2));
        case "OR":
            JSONArray orargs = obj.getJSONArray("Args");
            JSONObject orobj1 = orargs.getJSONObject(0);
            JSONObject orobj2 = orargs.getJSONObject(1);
            return new OrBusinessRule(createRule(orobj1), createRule(orobj2));
        case "GREATER THAN":
            JSONArray gtargs = obj.getJSONArray("Args");
            JSONObject gtobj1 = gtargs.getJSONObject(0);
            JSONObject gtobj2 = gtargs.getJSONObject(1);
            return new GreaterThanBusinessRule(createOperator(gtobj1), createOperator(gtobj2));
        case "NOT BLANK":
            JSONObject nbobj = obj.getJSONObject("Arg");
            return new NotBlankBusinessRule(createOperator(nbobj));
        default:
            return null;
        }
    }

    public static BusinessRule generateRule(String inputBusinessRule) {
        JSONObject obj = new JSONObject(inputBusinessRule);
        return createRule(obj);
    }
}
