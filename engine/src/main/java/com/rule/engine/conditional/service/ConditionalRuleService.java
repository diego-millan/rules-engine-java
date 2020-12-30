package com.rule.engine.conditional.service;

import com.rule.engine.conditional.ConditionalEngine;
import com.rule.engine.conditional.ConditionalRule;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

public class ConditionalRuleService {
    @Autowired
    ConditionalEngine engine;

    private String identifier;

    public ConditionalRuleService(String identifier) {
        this.identifier = identifier;
    }

    public void processEngine(ConditionalRule... ruleList) {
        this.engine.execute(identifier, Arrays.asList(ruleList));
    }

    public void processEngine(List<ConditionalRule> ruleList) {
        this.engine.execute(identifier, ruleList);
    }
}
