package org.example._2023_12_21;

import com.github.javafaker.Faker;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.TreeMap;

public class PR2 {
    private final static Faker FAKER = new Faker();
    private final static Random RANDOM = new Random();

    public static void main(String[] args) {
//        Map<Character, Boolean> map = new TreeMap<>();
//        map.put('z', true);
//        map.put('o', true);
//        map.put('e', true);
//        map.put('x', false);
//
//        System.out.println(map);

        Map<Beer, Boolean> map = new TreeMap<>();

        for (int i = 0; i < 5; i++) {
            map.put(new Beer(RANDOM.nextInt(10), FAKER.beer().name(), (char) RANDOM.nextInt(75)), true);
        }

        System.out.println(map);
    }
}

class Beer implements Comparable<Beer> {
    private int alcoholPrec;
    private String beerName;
    private char clazz;

    public Beer(int alcoholPrec, String beerName, char clazz) {
        this.alcoholPrec = alcoholPrec;
        this.beerName = beerName;
        this.clazz = clazz;
    }

    public int getAlcoholPrec() {
        return alcoholPrec;
    }

    public void setAlcoholPrec(int alcoholPrec) {
        this.alcoholPrec = alcoholPrec;
    }

    public String getBeerName() {
        return beerName;
    }

    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }

    public char getClazz() {
        return clazz;
    }

    public void setClazz(char clazz) {
        this.clazz = clazz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Beer)) {
            return false;
        }

        Beer beer = (Beer) o;
        return alcoholPrec == beer.alcoholPrec;
    }

    /**
     * o1.equals(o2);
     *
     */

    @Override
    public int hashCode() {
        return Objects.hash(alcoholPrec);
    }

    @Override
    public String toString() {
        return "Car{" +
                "alcoholPrec=" + alcoholPrec +
                ", beerName='" + beerName + '\'' +
                ", clazz=" + clazz +
                '}';
    }

    @Override
    public int compareTo(@NotNull Beer o) {
        return this.alcoholPrec - o.alcoholPrec;
    }
}