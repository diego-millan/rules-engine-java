package com.rule.engine.conditional.exception;

import lombok.Getter;

public class BusinessRuleException extends RuntimeException {
    @Getter
    private String errorCause;
    @Getter
    private String errorCode;

    public BusinessRuleException(String message) { super(message); }

    public BusinessRuleException(String message, String errorCause) {
        super(message);
        this.errorCause = errorCause;
    }
    public BusinessRuleException(String message, String errorCause, String errorCode) {
        super(message);
        this.errorCause = errorCause;
        this.errorCode = errorCode;
    }
}
