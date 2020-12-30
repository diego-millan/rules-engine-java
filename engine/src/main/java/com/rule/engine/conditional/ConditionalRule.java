package com.rule.engine.conditional;

import com.rule.engine.conditional.exception.ConditionalRuleException;
import lombok.Getter;
import lombok.Setter;

public abstract class ConditionalRule<T, E extends ConditionalRuleException> {
    @Getter
    public String name;
    @Getter
    public Integer priority;
    @Getter
    private String description;
    @Getter @Setter
    private T target;
    @Getter @Setter
    private E exception;

    public ConditionalRule (String name, Integer priority, String description , T target) {
        this.name = name;
        this.priority = priority;
        this.description = description;
        this.target = target;
    }

    public ConditionalRule(Integer priority, String description , T target) {
        this.priority = priority;
        this.description = description;
        this.target = target;
    }

    public abstract void processCondition() throws E;

    public abstract void execute();

    @Override
    public String toString() {
        return String.format("ConditionalRule{ name = %s - priority = %d - description = %s }",
                name, priority, description);
    }
}
