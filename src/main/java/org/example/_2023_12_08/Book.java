package org.example._2023_12_08;

import lombok.*;

@Getter
@Setter
@ToString
public class Book {
    private String author;
    private String name;
    private int issueYear;
    private Condition condition;
    private boolean isEBOOK;

    public Book(String author, String name, int issueYear, Condition condition, boolean isEBOOK) {
        this.author = author;
        this.name = name;
        this.issueYear = issueYear;
        this.condition = condition;
        this.isEBOOK = isEBOOK;
    }
}