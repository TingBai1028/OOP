package unsw.business;

import java.util.Map;

public class LookUpBusinessOperator implements BusinessOperator {
    private String arg;

    public LookUpBusinessOperator(String arg) {
        this.arg = arg;
    }

    @Override
    public Object evalute(Map<String, Object> values) {
        return values.get(arg);
    }

}
