package org.example._2024_01_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Str2 {
    public static void main(String[] args) {
        /**
         * Stream API
         */

        /**
         * STREAM -> INTER -> TERMINAL
         */

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 5, 5, 6, 6, 7, 8, 9, 11);
        int[] arr = {1, 2, 3, 4, 4, 5, 5, 6, 6, 7, 8, 9, 11};
        Stream<Integer> stream = Stream.of(3, 4, 4, 5, 5, 6, 6, 7, 8, 9, 11);

        /**
         * List list.stream() == stream
         * Array Arrays.stream(arr) == stream
         * Stream.of
         */

        /**
         * сумма всех четных, неповторяющихся элементов больше 5
         */

        int s = list.stream()
                .distinct() //1, 2, 3, 4, 5, 6, 7, 8, 9, 11
                .filter(Str2::fil) //6,  8,
                .reduce(Integer::sum)
                .get();
    }

    public static boolean fil(Integer i) {
        return (i % 2 == 0 && i > 5);
    }
}