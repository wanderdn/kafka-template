package com.templates.util;

public interface KafkaEventValidator {
    void validate() throws KafkaEventValidateException;

}
