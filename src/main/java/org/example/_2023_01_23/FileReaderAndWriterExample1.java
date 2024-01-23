package org.example._2023_01_23;

import java.io.FileReader;
import java.io.IOException;

//txt
public class FileReaderAndWriterExample1 {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("prog.txt")) {
            int c;

            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }

            System.out.println("DONE!!!!!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
