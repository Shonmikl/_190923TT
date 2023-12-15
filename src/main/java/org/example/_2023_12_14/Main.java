package org.example._2023_12_14;

import java.security.cert.X509CertSelector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(10_000_000);
        list.add("A");
        list.add("AA");
        list.add("AS");
        list.add("AC");
        list.add("VA");
        list.add("BFA");
        list.add("ART");
        list.add("DDSA");
        list.add("AGg");
        list.add("AWEGg");
        list.add("AGg");
        list.add("AGSg");
        list.add("AGg");
        list.add("AGgXX");
        list.add("AZCGg");

        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println(list.get(list.size() - 1));

        int[] a = {1, 2, 3, 4, 5, 6};
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        for (int i = 0; i < list1.size(); i++) {
            sum = sum + list1.get(i);
        }
    }
}
