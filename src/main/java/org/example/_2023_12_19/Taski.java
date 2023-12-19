package org.example._2023_12_19;

import java.util.Map;

public class Taski {

    /**
     * HashMap<String, String>: Найдите количество пар
     * ключ-значение, где длина ключа равна длине значения.
     */
    private static int findMapPairs(Map<String, String> map) {
        int count = 0;
        for (Map.Entry<String, String> pairs : map.entrySet()) {
            if (pairs.getKey().length() == pairs.getValue().length()) {
                count++;
            }
        }
        return count;
    }
}
