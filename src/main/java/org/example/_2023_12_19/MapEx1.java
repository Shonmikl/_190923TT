package org.example._2023_12_19;

import java.util.*;
import java.util.logging.XMLFormatter;
import java.util.zip.ZipEntry;

public class MapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "P");
        map.put(4, "O");
        map.put(2, "W");
        map.put(3, "V");
        System.out.println(map);



//        List<Integer> list = Arrays.asList(12, 36, 54, 7, 89);
//        for (Integer i : list) {
//            System.out.println(i);
//        }


        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }

    }
}
