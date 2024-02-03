package org.example._2023_02_03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Card {
    public static void main(String[] args) {
        String card = "69521365741236580112365";
        String regex = "(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(card);

        String str = matcher.replaceAll("CARD NUMBER: $1 $2 $3 $4 EXP: $5/$6 CVV: $7");
        System.out.println(str);
    }
}
