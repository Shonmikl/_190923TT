package org.example._2024_01_09;

public class Str1 {
    //sum(do(), 5)
    public static void main(String[] args) {
//        m1(new Printer() {
//            @Override
//            public void get() {
//                System.out.println("!!!");
//            }
//        });

//        m1(() -> System.out.println("++++"));

        m1(Str1::w1);
    }

    public static void m1(Printer printer) {
        printer.get();
    }

    public static void w1() {
        System.out.println("$$$");
    }
}

@FunctionalInterface
interface Printer {
    void get();
}