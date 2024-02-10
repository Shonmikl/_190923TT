package org.example.TESTING._2024_02_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PTex {

    @RepeatedTest(value = 5)
    void greaterThanZero() {
        Assertions.assertTrue("qw".length() > 0);
        Assertions.assertTrue("qwer".length() > 0);
        Assertions.assertTrue("qw234".length() > 0);
        Assertions.assertTrue("qwerw".length() > 0);
        Assertions.assertTrue("q34346w".length() > 0);
    }

    @ParameterizedTest
    @ValueSource(strings = {"q", "qq", "qqq", "qqqq"})
    void greaterThanZeroParam(String args) {
        Assertions.assertTrue(args.length() > 0);
    }

//    @ParameterizedTest
//    @CsvFileSource(resources = "file.csv")
//    void greaterThanZeroParamEX(String args) {
//
//    }
}
