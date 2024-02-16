package org.example._2024_02_16;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RefEx3 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<Template> templateClass = Template.class;

        Constructor<Template> constructor1 = templateClass.getConstructor();
        Template obj1 = constructor1.newInstance();

        Constructor<Template> constructor2 = templateClass.getConstructor(int.class, String.class, String.class);
        Object obj2 = constructor2.newInstance(1, "STRING_1", "STRING_2");

//        System.out.println(obj2);

//        Method method = templateClass.getMethod("setPrice", double.class);
//        method.invoke(obj2, 9999);
//
//        System.out.println(obj2);

        Field field = templateClass.getDeclaredField("price");

        field.setAccessible(true);

        double value = (double) field.get(obj2);
        System.out.println(value);


    }
}
