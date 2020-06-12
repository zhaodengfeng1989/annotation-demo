package com.zhaodf;

import javax.xml.bind.annotation.XmlAnyElement;
import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.ANNOTATION_TYPE,
        ElementType.CONSTRUCTOR,ElementType.METHOD,ElementType.PARAMETER,
        ElementType.LOCAL_VARIABLE,ElementType.PACKAGE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MyAnnotation {
    String value() default "";
    String desc() default "zhaodf 写的注解";
}
