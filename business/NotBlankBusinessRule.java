package unsw.business;

import java.util.Map;

public class NotBlankBusinessRule implements BusinessRule {
    private BusinessOperator bo;

    public NotBlankBusinessRule(BusinessOperator bo) {
        this.bo = bo;
    }

    @Override
    public boolean evaluate(Map<String, Object> values) {
        return bo.evalute(values) != null;
    }

}
