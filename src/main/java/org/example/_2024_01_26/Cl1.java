package org.example._2024_01_26;

public class Cl1 {
    public static int getSingle(int[] array) {
        //[1 2 1 3 2 3 5]
        int xor = 0;
        for (int x : array) {
            xor ^= x;
        }
        return xor;
    }

    //25 - 00001101
}
