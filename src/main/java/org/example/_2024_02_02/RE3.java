package org.example._2024_02_02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE3 {
    public static void main(String[] args) {
        String t1 = "ABsC ABCD BAB/ ///AA78AB2ADACab4ABAC3BcvdBC AB5BABCD";

//        String r1 = "[ABC]"; или А или B или C
//        String r1 = "AB[C-X]D";
//        String r1 = "ab[a-zA-Z0-9]A";
//        String r1 = "ab[^a-z]A";
//        String r1 = "^ABC";
//        String r1 = "[0-9]";
//        String r1 = "[0-9]";
//        String r1 = "\\d";
//        String r1 = "\\D";
//        String r1 = "\\w";
//        String r1 = "\\W";
//        String r1 = "\\w+";
//        String r1 = "\\W+";//!!! underscore???
        String r1 = "\\w{4}";//!!! underscore???

        Pattern pattern = Pattern.compile(r1);
        Matcher matcher = pattern.matcher(t1);

        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + " : " + matcher.group());
        }
    }
}