package com.rule.engine.conditional;

import com.rule.engine.conditional.exception.ConditionalRuleException;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConditionalEngine {
    public void execute(String identifier, List<ConditionalRule> ruleList) {
        ruleList.sort(Comparator.comparing(ConditionalRule::getPriority));
        this.processConditionals(identifier, ruleList);
    }

    private void processConditionals(String identifier, List<ConditionalRule> ruleList) {
        Map<String, Boolean> mapResult = new HashMap<>();

        for (ConditionalRule rule : ruleList) {
            try {
                rule.execute();
                mapResult.put(rule.getName(), true);
            } catch (ConditionalRuleException e) {
                mapResult.put(rule.getName(), false);
                e.setSummary(mapResult.toString());
                throw e;
            }
        }
    }
}
