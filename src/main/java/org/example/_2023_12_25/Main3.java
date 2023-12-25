package org.example._2023_12_25;

import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 36, 54, 5, 11, 12, 5, 43, 51, 2);

        int a = list.stream()
                .distinct() //12, 36, 54, 11, 5, 43, 51, 2
                .filter(el -> el % 2 == 0) //12, 36, 54, 2
                .reduce(Integer::sum)
                .get();
    }
}
