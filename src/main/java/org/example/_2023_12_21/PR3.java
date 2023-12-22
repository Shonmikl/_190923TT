package org.example._2023_12_21;

import com.github.javafaker.Faker;

import java.util.*;

public class PR3 {
    private final static Faker FAKER = new Faker();
    private final static Random RANDOM = new Random();
    public static void main(String[] args) {
        List<Beer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new Beer(RANDOM.nextInt(10), FAKER.beer().name(), (char) RANDOM.nextInt(75)));
        }

        System.out.println(list);
        System.out.println("------------------------------------------------");

        Collections.sort(list, new BeerNameComparator());
        System.out.println(list);

    }
}


class BeerNameComparator implements Comparator<Beer> {

    @Override
    public int compare(Beer o1, Beer o2) {
        return o1.getBeerName().compareTo(o2.getBeerName());
    }
}