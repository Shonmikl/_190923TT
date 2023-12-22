package org.example._2023_12_21;

import java.util.Objects;

public class HashExample {
    int a;
    String b;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HashExample)) return false;
        HashExample that = (HashExample) o;
        return a == that.a && Objects.equals(b, that.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
