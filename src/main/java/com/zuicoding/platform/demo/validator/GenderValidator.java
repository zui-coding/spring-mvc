package com.zuicoding.platform.demo.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by <a href="mailto:stephen.linicoding@gmail.com">Stephen.lin</a> on 2018/1/9.
 * <p>
 * <p>
 * </p>
 */
public class GenderValidator implements ConstraintValidator<GenderAnnotation,Gender> {

    private Logger logger = LoggerFactory.getLogger(GenderValidator.class);

    @Override
    public void initialize(GenderAnnotation constraintAnnotation) {
        logger.info("{}",constraintAnnotation);
    }

    @Override
    public boolean isValid(Gender value, ConstraintValidatorContext context) {

        return Gender.WOMAN.equals(value);
    }
}
