package com.rule.engine.conditional.exception.notification;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class FrontendErrorNotification {
    String id;
    String code;
    String title;
    String description;
    String buttonLabel;
    String buttonUrl;
}
