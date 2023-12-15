package org.example._2023_12_15;

import java.util.*;

public class Ver1 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(222));
        }


        list.remove(1);
        System.out.println(list.isEmpty());
        list.add(5, 666);
        System.out.println(list.get(0));
        System.out.println(list.size());
        System.out.println(list);
    }
}
