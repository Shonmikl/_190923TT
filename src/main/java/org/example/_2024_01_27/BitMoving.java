package org.example._2024_01_27;

public class BitMoving {
    //метод для показа разрядов
    public static void printBinary(int b) {
        System.out.println("0b" + Integer.toBinaryString(0b10000000 | (b & 0xff)).substring(1));
    }

    public static void main(String[] args) {
        int a = 5; // 00000101
        int b = 955;

        int ab = 0b00000101;
        int ah = 0xff; //hex
        System.out.println(ab);

        System.out.println("Сдвиг вправо '5': " + (a >> 1));
        System.out.println("Сдвиг влево '5': " + (a << 1));
        System.out.println("Сдвиг влево '5': " + (a << 2));
        System.out.println("Сдвиг влево '5': " + (a << 3));

        System.out.println("************************************************");

        int a1 = 0b00001001;
        int b1 = 0b00001010;

        System.out.println("'&' AND:");
        printBinary(a1);
        printBinary(b1);

        printBinary(a1 & b1);
        System.out.println("************************************************");

        System.out.println("'|' OR:");
        printBinary(a1);
        printBinary(b1);

        printBinary(a1 | b1);
        System.out.println("************************************************");

        System.out.println("'^' XOR:");
        printBinary(a1);
        printBinary(b1);

        printBinary(a1 ^ b1);
        System.out.println("************************************************");

        System.out.println("'~' INVERSION:");
        printBinary(a1);

        printBinary(~a1);
        System.out.println("************************************************");
    }
}
