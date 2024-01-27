package org.example._2024_01_27;

public class Cl1 {
    public static int getSingle(int[] array) {
        int xor = 0;
        for (int x : array) {
            xor = xor ^ x;
        }
        return xor;
        /**
         * xor 0 -> 0 0 0 0  0 0 0 0
         * arr -> [+1, +1, +2, +4, +3, +3, 2]
         *
         *          start
         *
         * xor 0 -> 0 0 0 0  0 0 0 0
         * x 1 ->   0 0 0 0  0 0 0 1
         *          0 0 0 0  0 0 0 1
         *
         * xor 1 -> 0 0 0 0  0 0 0 1
         * x 1 ->   0 0 0 0  0 0 0 1
         * xor 0 -> 0 0 0 0  0 0 0 0
         *
         * xor 0 -> 0 0 0 0  0 0 0 0
         * x 2 ->   0 0 0 0  0 0 1 0
         * xor 2 -> 0 0 0 0  0 0 1 0
         *
         * xor 2 -> 0 0 0 0  0 0 1 0
         * x 4 ->   0 0 0 0  0 1 0 0
         * xor 6 -> 0 0 0 0  0 1 1 0
         *
         * xor 6 -> 0 0 0 0  0 1 1 0
         * x 3 ->   0 0 0 0  0 0 1 1
         * xor 5 -> 0 0 0 0  0 1 0 1
         *
         * xor 5 -> 0 0 0 0  0 1 0 1
         * x 3 ->   0 0 0 0  0 0 1 1
         * xor 6 -> 0 0 0 0  0 1 1 0
         *
         * xor 6 -> 0 0 0 0  0 1 1 0
         * x 2 ->   0 0 0 0  0 0 1 0
         * xor 4 -> 0 0 0 0  0 1 0 0
         */

    }

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 4, 3, 3, 2,};
        System.out.println(getSingle(array));
    }
}
