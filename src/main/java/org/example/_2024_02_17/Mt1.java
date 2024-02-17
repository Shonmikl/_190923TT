package org.example._2024_02_17;

public class Mt1 {
    public static void main(String[] args) {
       TH1 th1 = new TH1();
       TH2 th2 = new TH2();

       th1.start();
       th2.start();
    }
}

class TH1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("TH1 I: " + i);
        }
    }
}

class TH2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("TH2 I: " + i);
        }
    }
}