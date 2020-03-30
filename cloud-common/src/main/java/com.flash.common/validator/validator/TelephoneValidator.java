package com.flash.common.validator.validator;


import com.flash.common.validator.annotation.Telephone;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;


public class TelephoneValidator implements ConstraintValidator<Telephone, String> {

    private Pattern pattern = Pattern.compile("(\\(\\d{3,4}\\)|\\d{3,4}-|\\s)?\\d{7,14}");

    private boolean nullable = false;

    @Override
    public void initialize(Telephone constraintAnnotation) {
        nullable = constraintAnnotation.nullable();
    }

    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {

        return (value == null || value.length() == 0) ? nullable : pattern.matcher(value).matches();
    }
}