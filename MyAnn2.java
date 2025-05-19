package com.sun.test.annotion;

public @interface MyAnn2
{
    String name() default "";

    String[] value() default "";
}
