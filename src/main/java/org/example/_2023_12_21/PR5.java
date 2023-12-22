package org.example._2023_12_21;

import com.github.javafaker.Faker;

import java.util.Random;

public class PR5 {
    public static void main(String[] args) {
        System.out.println(new Random().equals(new Random()));
        Object o = new Object();
        Wheel wheel = (Wheel) o;

    }
}

class Wheel {

    String type;
}
