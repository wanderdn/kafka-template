package ru.sbrf.privatebussiness.goverment.melpen.util;

public interface KafkaEventValidator {
    void validate() throws KafkaEventValidateException;

}
