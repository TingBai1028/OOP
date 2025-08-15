package unsw.business;

import java.util.Map;

public class AndBusinessRule implements BusinessRule {
    private BusinessRule br1;
    private BusinessRule br2;

    public AndBusinessRule(BusinessRule br1, BusinessRule br2) {
        this.br1 = br1;
        this.br2 = br2;
    }

    @Override
    public boolean evaluate(Map<String, Object> values) {
        return br1.evaluate(values) && br2.evaluate(values);
    }

}
