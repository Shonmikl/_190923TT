package org.example._2024_02_16;

import lombok.Getter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Info
public class Ann1 {

    @Getter
    @Deprecated
    private String name;

    public void setName(@Info String name) {
        this.name = name;
    }

    public static void main(String[] args) {

    }
}

@Target({ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.CLASS)
@interface Info {
    String info() default "";
}
