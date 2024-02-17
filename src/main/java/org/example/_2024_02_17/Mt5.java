package org.example._2024_02_17;

public class Mt5 extends Thread {
    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("COUNTER: " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("MAIN START");
        Mt5 mt5 = new Mt5();
        mt5.start();

        Thread.sleep(1500);
        System.out.println("WAKE UP!");

        mt5.b = false;
        mt5.join();

        System.out.println("MAIN END");
    }
}
