package com.rule.engine.conditional;

import com.rule.engine.conditional.exception.ConditionalRuleException;
import com.rule.engine.conditional.exception.service.FrontEndErrorService;

public abstract class DietRule <T, E extends ConditionalRuleException> extends ConditionalRule<T,E> {
    public DietRule(String name, Integer priority, String description, T target) {
        super(name, priority, description, target);
    }
    @Override
    public void execute() {
        try {
            this.processCondition();
        } catch (ConditionalRuleException ex) {
            FrontEndErrorService frontEndErrorService = new FrontEndErrorService();
        }
    }
}
