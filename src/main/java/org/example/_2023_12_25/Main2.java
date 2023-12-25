package org.example._2023_12_25;

public class Main2 {
    public static void main(String[] args) {
       met(Main2::ref);
    }

    public static void met(Inter2 inter) {
        System.out.println("1");
        inter.get2();
    }

    public static void ref() {
        System.out.println("987");
        System.out.println("654");
    }
}

@FunctionalInterface
interface Inter2 {
    void get2();
}