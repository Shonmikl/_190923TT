package org.example._2024_02_27;

import java.util.List;

public enum Cat {
    ELECTRONICS("1"),
    COSMETICS("2");

    List<Cat> subCat;

    String catCode;

    Cat(String catCode) {
        this.catCode = catCode;
    }
}
