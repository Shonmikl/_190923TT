package org.example._2023_12_19;

import java.util.ArrayList;
import java.util.List;

public class HW {
    static List<List<Integer>> generateSubsets(List<Integer> nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsetsHelper(nums, 0, new ArrayList<>(), result);
        return result;
    }

    public static void generateSubsetsHelper(List<Integer> nums, int index,
                                             List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
        for (int i = index; i < nums.size(); i++) {
            current.add(nums.get(i));
            generateSubsetsHelper(nums, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        List<List<Integer>> allSubsets = HW.generateSubsets(numbers);
        for (List<Integer> subset : allSubsets) {
            System.out.println(subset);
        }
    }
}