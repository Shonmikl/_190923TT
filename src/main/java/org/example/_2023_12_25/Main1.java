package org.example._2023_12_25;

public class Main1 {
    public static void main(String[] args) {
        System.out.println(met((str, num) -> (str + num), "Hola ", 888));
    }

    public static String met(Inter1 inter, String s, int num) {
        System.out.println("1");
        return inter.get1(s, num);
    }
}


@FunctionalInterface
interface Inter1 {
    String get1(String str, int num);
}