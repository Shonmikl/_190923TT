package org.example._2023_12_12;

import java.util.List;

public class Ex11 {
    public static void main(String[] args) {
        Emp emp = new Emp("Nik", "U", AccessL.MEDIUM);
        Emp[] empArr = {emp};

        for (int i = 0; i < empArr.length; i++) {
            if(empArr[i].accessL == AccessL.LOW) {
                System.out.println("!!!!");
            }
        }

        AccessL[] accessLS = AccessL.values();
        for (AccessL acc : accessLS) {
            System.out.println(acc);
        }
    }
}

class Company {
    List<Emp> employeeList;

    public boolean checkEmployee(AccessL al) {
        return true;
    }
}

class Emp {
    String name;
    String surName;
    AccessL accessL;

    public Emp(String name, String surName, AccessL accessL) {
        this.name = name;
        this.surName = surName;
        this.accessL = accessL;
    }
}

class AC {
    private static final String LOW = "LOW";
}

enum AccessL {
    HIGH('@'),
    MEDIUM('#'),
    LOW('&');

    char param;

    AccessL(char param) {
        this.param = param;
    }
}