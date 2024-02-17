package org.example._2024_02_17;

/**
 *
 */
public class Mt2 {
    public static void main(String[] args) {
        Thread T1 = new Thread(new Th11());
        Thread T2 = new Thread(new Th22());

        T1.start();
        T2.start();
    }
}


class Th11 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("TH1 I: " + i);
        }
    }
}

class Th22 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("TH2 I: " + i);
        }
    }
}