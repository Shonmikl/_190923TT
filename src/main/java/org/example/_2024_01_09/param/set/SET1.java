package org.example._2024_01_09.param.set;

import java.util.*;

public class SET1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        list.add("qwerty");
        String s = list.get(0);

//        ParamClass<String> paramString = new ParamClass<>("Str");
//        ParamClass<Integer> paramInt = new ParamClass<>(123);
//   ***с одним параметром***
//        System.out.println(paramString.getValue());

        ParamClass<Integer, String> p1 = new ParamClass<>(1, "S");







    }
}


class ParamClass<T1, T2> {
    private T1 value1;
    private T2 value2;

    public ParamClass(T1 value1, T2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T1 getValue1() {
        return value1;
    }

    public void setValue1(T1 value1) {
        this.value1 = value1;
    }

    public T2 getValue2() {
        return value2;
    }

    public void setValue2(T2 value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "ParamClass{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}
