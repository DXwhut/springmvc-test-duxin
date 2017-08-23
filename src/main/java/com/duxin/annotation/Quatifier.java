package com.duxin.annotation;

import java.lang.annotation.*;

/**
 * Created by duxin on 2017/8/23.
 */
@Target({ ElementType.FIELD }) // 代表注解的注解
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Quatifier {
    String value() default "";
}
