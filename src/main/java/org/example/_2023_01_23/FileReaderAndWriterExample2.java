package org.example._2023_01_23;

import java.io.FileWriter;
import java.io.IOException;

//txt
public class FileReaderAndWriterExample2 {
    public static void main(String[] args) {
        String text = "Olga -> A Flushable is a destination of data that can be flushed.";

        try (FileWriter writer = new FileWriter("123456.txt")) {

            for (int i = 0; i < text.length(); i++) {
                writer.write(text.charAt(i));
            }

            System.out.println("DONE!!!!!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
