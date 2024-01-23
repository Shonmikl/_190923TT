package org.example._2023_01_23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//txt
public class BufferReaderAndWriterExample1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("prog.txt"));
            String str;
//            reader.lines()
//                    .map(el)

            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }

            System.out.println("DONE!!!!!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            reader.close();
        }
    }
}
