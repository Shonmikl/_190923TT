package org.example._2023_12_15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Test {
    private static final Random RANDOM = new Random();
    private static final int capacity = 10_000_000;
    private static final int insert = 1000;

    private static List<Integer> list = new LinkedList<>();

    public static void main(String[] args) {
        /**
         * AL 21110
         * LL 1
         */

        for (int i = 0; i < capacity; i++) {
            list.add(RANDOM.nextInt(500));
        }
        ///////////////////////////////////////////
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < insert; i++) {
            list.add(1, RANDOM.nextInt());
        }

        long endTime = System.currentTimeMillis();
        ///////////////////////////////////////////

        System.out.println("TIME: " + (endTime - startTime));
    }
}