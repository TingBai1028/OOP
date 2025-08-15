package unsw.business;

import java.util.Map;

public class ConstantBusinessOperator implements BusinessOperator {
    private Object constant;

    public ConstantBusinessOperator(Object constant) {
        this.constant = constant;
    }

    @Override
    public Object evalute(Map<String, Object> values) {
        return constant;
    }

}
