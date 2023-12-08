package org.example._2023_12_08;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Library {
    private String address;
    private long bookNumbers;
    private Book[] books;
}
