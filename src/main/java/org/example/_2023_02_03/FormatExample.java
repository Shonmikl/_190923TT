package org.example._2023_02_03;

/**
 * -
 *
 */
public class FormatExample {
    public static void show(Wheel wheel) {
        System.out.printf("%03d \t %-2s \t %-2s \t %,1f \n",
                            wheel.id, wheel.name, wheel.surName, wheel.salary);
    }
    public static void main(String[] args) {
        Wheel wheel = new Wheel();
        wheel.id = 1;
        wheel.name = "Name";
        wheel.surName = "SurName";
        wheel.salary = 123456.69d;

        show(wheel);
    }
}

class Wheel {
    int id;
    String name;
    String surName;
    double salary;

    @Override
    public String toString() {
        return "Wheel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

