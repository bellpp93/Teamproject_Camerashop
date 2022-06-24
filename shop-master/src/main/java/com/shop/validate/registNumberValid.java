package com.shop.validate;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = registNumberValidator.class)
@Target(FIELD)
@Retention(RUNTIME)
public @interface registNumberValid {
    String message() default "can't contain special character";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
