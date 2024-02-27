package org.example._2024_02_27;

public class Dex1 {
    public static void main(String[] args) {
        System.out.println("MAIN START");
        UT1 ut1 = new UT1();
        DT dt = new DT();

        ut1.setName("USER THREAD");
        dt.setName("DAEMON THREAD");

        dt.setDaemon(true);

        ut1.start();
        dt.start();

        System.out.println("MAIN END");
    }
}

class UT1 extends Thread {

    @Override
    public void run() {
        System.out.println("UT1 NAME: " + Thread.currentThread().getName());
        System.out.println("UT1 IS DAEMON: " + isDaemon());

        try {
            for (char c = '!'; c < 'z'; c++) {
                Thread.sleep(444);
                System.out.println("UT1 --> " + c);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class DT extends Thread {

    @Override
    public void run() {
        System.out.println("DT NAME: " + Thread.currentThread().getName());
        System.out.println("DT IS DAEMON: " + isDaemon());

        try {
            for (int i = 0; i < 999; i++) {
                Thread.sleep(888);
                System.out.println("DT --> " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}