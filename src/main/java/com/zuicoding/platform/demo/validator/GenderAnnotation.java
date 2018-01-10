package com.zuicoding.platform.demo.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * Created by <a href="mailto:stephen.linicoding@gmail.com">Stephen.lin</a> on 2018/1/9.
 * <p>
 * <p>
 *     性别注解
 * </p>
 */
@Target({ ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = GenderValidator.class)
public @interface GenderAnnotation {

    /**
     * 默认是男人
     * @return
     */
    Gender value() default Gender.MAN;
    String message() default "必须是女人";
    /*下面两个方法，必须要写*/
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
