package org.example._2023_12_25;

public class Main {
    static int a(int a) {
        return a * 10;
    }

    static int b(int b) {
        return b * 20;
    }
    public static void main(String[] args) {
        met((ap) -> System.out.println(ap), "999");
    }

    public static void met(Inter inter, String s) {
        System.out.println("1");
        inter.get(s);
    }
}

@FunctionalInterface
interface Inter {
    void get(String str);
}