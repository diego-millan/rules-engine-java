package com.rule.engine.conditional.exception;

import com.rule.engine.conditional.exception.notification.FrontendErrorNotification;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

public class ConditionalRuleException extends BusinessRuleException {
    @Getter
    private String errorCause;
    @Getter
    private String errorCode;
    @Getter @Setter
    private String summary;
    @Getter @Setter
    private FrontendErrorNotification frontendErrorNotification;

    public ConditionalRuleException(String name, String code) {
        super(name, name, code);
        this.errorCause = name;
        this.errorCode = code;
    }

    public ConditionalRuleException(String name, String code, Map<String, List<String>> errorMessageParams) {
        super(name, name, code);
        this.errorCause = name;
        this.errorCode = code;
    }
}
