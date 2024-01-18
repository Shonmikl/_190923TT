package org.example._2024_01_16;

import java.util.List;

public class LNode {
    int x;
    LNode next;

    public LNode(int x) {
        this.x = x;
        this.next = null;
    }

    public static void main(String[] args) {
        LNode n1 = new LNode(1);
        LNode n2 = new LNode(2);
        LNode n3 = new LNode(3);
        LNode n4 = new LNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;
    }

    public static boolean isC(LNode head) {
        return true;
    }

    //todo
    public static List<int[][]> attack(int[][] kinkCoordinate,  int[][] queens) {
        return null;
    }


}
