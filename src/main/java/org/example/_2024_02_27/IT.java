package org.example._2024_02_27;

public class IT {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("MAIN START");

        ITExample thread = new ITExample();
        thread.start();

        Thread.sleep(111);
        thread.interrupt();

        thread.join();
        System.out.println("MAIN END");
    }
}

class ITExample extends Thread {
    double sqrt = 0;

    @Override
    public void run() {
        for (int i = 1; i < 1_000_000; i++) {
            if(isInterrupted()) {
                System.out.println("THREAD will be interrupted");
                return;
            }
            sqrt = Math.sqrt(i);
            try {
                Thread.sleep(22);
            } catch (InterruptedException e) {
                System.out.println("THREAD was interrupted while sleeping");
            }
        }
        System.out.println("SQRT: " + sqrt);
    }
}