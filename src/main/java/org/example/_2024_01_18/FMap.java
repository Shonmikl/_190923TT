package org.example._2024_01_18;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FMap {

    List<Integer> listA1 = Arrays.asList(1, 2, 3, 4, 5);
    public static void main(String[] args) {
        List<String> list = Arrays.asList("mama", "myla", "ramu");
        List<String> charsOfStrings =
                list.stream()
                        .flatMap(str -> Arrays.stream(str.split("")))
                        .toList();
        System.out.println(charsOfStrings);

        List<List<Integer>> listList = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6),
                Arrays.asList(7, 8),
                Arrays.asList(9, 11)
        );

        listList.stream()
                .flatMap(Collection::stream)
                .filter(el -> el % 2 == 0)
                .forEach(System.out::println);

        List<Integer> listA = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> listB = Arrays.asList(6.1d, 7.0d, 8d, 10d);
        List<Number> list1 = Stream.concat(listA.stream(), listB.stream())
                .collect(Collectors.toList());


        List<Integer> sumList =
                listA.stream()
                        .flatMap(el-> new FMap().get(el))
                        .toList();
    }
    
    public Stream<Integer> get(Integer el) {
        return new FMap().listA1.stream().map(e1 -> e1 + el);
    }
}
