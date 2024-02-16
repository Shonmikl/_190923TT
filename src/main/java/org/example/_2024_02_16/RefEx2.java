package org.example._2024_02_16;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class RefEx2 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
//        Class<Template> templateClass = (Class<Template>) Class.forName("org.example._2024_02_16.Template");
        Class<Template> templateClass = Template.class;

//        Field field = templateClass.getField("id");
//        System.out.println("Filed id: " + field);

//        Field[] fields = templateClass.getFields();
//        for (Field f : fields){
//            System.out.println("Field: " + f);
//        }

//        Field[] fields = templateClass.getDeclaredFields();
//        for (Field f : fields) {
//            System.out.println("Field: " + f);
//        }

        Method method = templateClass.getMethod("upPrice");
        System.out.println("Method: " + method);
        System.out.println("Method return typ: " + method.getReturnType());
        System.out.println("Method param type: " + Arrays.toString(method.getParameterTypes()));
    }
}