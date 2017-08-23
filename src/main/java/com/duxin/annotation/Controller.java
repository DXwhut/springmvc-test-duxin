package com.duxin.annotation;

import java.lang.annotation.*;
/**
 * Created by duxin on 2017/8/23.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Controller {
    String value() default "";
}

