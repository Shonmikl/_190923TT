package org.example.TESTING._2024_02_06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ABC1Test {
    private static final ABC1 ABC_1 = new ABC1();
    private static final int expected = 10;

    @Test
    void sumTest() {
        int actual = ABC_1.sum(8, 2);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void dividePositiveTest() {
        int actual = ABC_1.divide(100, 10);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void divideWithExceptionTest() {
        Assertions.assertThrows(ArithmeticException.class, () -> ABC_1.divide(100, 0));
    }
}