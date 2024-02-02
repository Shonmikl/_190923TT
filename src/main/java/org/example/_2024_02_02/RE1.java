package org.example._2024_02_02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE1 {

    public static void main(String[] args) {
        String text = "Una de las ofertas de Xiaomi te acerca " +
                "un dispos-itivo@gmail.com completo y muy tentador que llegó " +
                "hace muy poco al mercado. Hablamos del POCO X6 5G, " +
                "que está a tu alcance por +79856321458 en su versión más potente. " +
                "Le acompañan 12 GB de RAM y 512 GB de almacenamiento, " +
                "no echarás nada en            falta";

//        String r1 = "\\b\\d{2}\\b";
//        String r1 = "\\+\\d{2}\\b";
        String r1 = "\\S+@\\w+\\.(com|es)";
//        String r1 = "\\w\\s+\\w";
//        String r1 = "\\D{4,9}";

        Pattern pattern = Pattern.compile(r1);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + " : " + matcher.group());
        }
    }
}