package unsw.business;

import java.util.Map;

public class GreaterThanBusinessRule implements BusinessRule {
    private BusinessOperator bo1;
    private BusinessOperator bo2;

    public GreaterThanBusinessRule(BusinessOperator bo1, BusinessOperator bo2) {
        this.bo1 = bo1;
        this.bo2 = bo2;
    }

    @Override
    public boolean evaluate(Map<String, Object> values) {
        return ((Number) bo1.evalute(values)).intValue() > ((Number) bo2.evalute(values)).intValue();
    }

}
