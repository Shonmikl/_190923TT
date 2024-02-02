package org.example._2024_02_02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE2 {
    public static void main(String[] args) {
        String t1 = "ABC ABCD BABAAABADACBDABACBABC ABBABCD";
        String r1 = "\\A";

        Pattern pattern = Pattern.compile(r1);
        Matcher matcher = pattern.matcher(t1);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}