package org.example._2023_12_14;

import org.example._2023_12_12.tE.Account;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main1 {
    public static List<Integer> testList(List<Integer> list) {
        list.add(new Random().nextInt(1111));
        list.add(new Random().nextInt(1111));
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);

        System.out.println(testList(list));
    }
}
