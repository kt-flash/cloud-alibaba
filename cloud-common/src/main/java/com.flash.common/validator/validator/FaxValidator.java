package com.flash.common.validator.validator;


import com.flash.common.validator.annotation.Fax;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;


public class FaxValidator implements ConstraintValidator<Fax, String> {

    private Pattern pattern = Pattern.compile("^(\\d{3,4}-)?\\d{7,8}$");

    private boolean nullable = false;

    @Override
    public void initialize(Fax constraintAnnotation) {
        nullable = constraintAnnotation.nullable();
    }

    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {

        return (value == null || value.length() == 0) ? nullable : pattern.matcher(value).matches();
    }
}