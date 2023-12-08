package org.example._2023_12_08;

import com.github.javafaker.Faker;
import lombok.experimental.UtilityClass;

import java.util.Random;

@UtilityClass
public class Generator {
    private static final Faker FAKER = new Faker();
    private static final Random RANDOM = new Random();

    private static Condition randomConditionGen() {
        Condition[] conditions = Condition.values(); //new old damaged
        int index = RANDOM.nextInt(3);
        return conditions[index];
    }

    private static boolean isEbookRandomGen() {
        boolean[] isEbook = {true, false};
        int index = RANDOM.nextInt(2);
        return isEbook[index];
    }

    public static Book[] bookGenerator(int bookNumbers) {
        Book[] books = new Book[bookNumbers];
        for (int i = 0; i < bookNumbers; i++) {
            books[i] = new Book(FAKER.book().author(),
                                FAKER.book().title(),
                                bookIssueDate(),
                                randomConditionGen(),
                                isEbookRandomGen());
        }
        return books;
    }

    private static int bookIssueDate() {
        /**
         * gen 1900 - 2022
         */
        return 0;
    }
}