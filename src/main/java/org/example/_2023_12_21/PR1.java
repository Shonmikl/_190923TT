package org.example._2023_12_21;

import org.example._2023_12_05.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PR1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "P");
        map.put(2, "Q");
        map.put(3, "E");

        System.out.println(map.hashCode());
        System.out.println(map.hashCode() % 16);

        Map<Person, Integer> map1;

    }
}
