package org.example.TESTING._2024_02_06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ABC2Test {
    private static final ABC2 ABC_2 = new ABC2();
    private static final String S1 = "1";
    private static final String S2 = "2";
    private static final String S3 = "3";

    @BeforeEach
    public void setUp() {
        ABC_2.getList().clear();
        ABC_2.addToList(S1);
        ABC_2.addToList(S2);
        ABC_2.addToList(S3);
    }

    @Test
    void addToListTest() {
        Assertions.assertEquals(3, ABC_2.getList().size());
    }

    @Test
    void modifyListTest() {
        ABC_2.modifyList();
        Assertions.assertEquals(Arrays.asList("1!", "2!", "3!"), ABC_2.getList());
    }
}