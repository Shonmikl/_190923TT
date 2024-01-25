package org.example._2023_01_23;

import java.io.*;

public class Task1Ex {
    /**
     * Прочитайте файл и посчитайте средний рейтинг всех стримов.
     * Запишите результат в новый файл.
     * <p>
     * 4: [Стрим 4], 4.8
     */

    private void readAndWrite(String readFrom, String writeTo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(readFrom));
             FileWriter writer = new FileWriter(writeTo)) {
            double average =
                    reader.lines()
                            .map(str -> str.split(", ")[1])
                            .mapToDouble(Double::parseDouble)
                            .average()
                            .orElse(0.0);
            writer.write(average + "");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}