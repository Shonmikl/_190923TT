package org.example._2024_02_20;

public class Mt5 {
    public static void main(String[] args) {
        MRI mri = new MRI();
        MRI mri1 = new MRI();

        Thread t1 = new Thread(mri);
        Thread t2 = new Thread(mri);
        Thread t3 = new Thread(mri1);

        t1.start();
        t2.start();
        t3.start();
    }
}

class Counter {
    long count = 0;
}

class MRI implements Runnable {

    Counter counter = new Counter();

    public void inc() {
        //-------------   -------------------
        synchronized (this) {
            try {
                Thread.sleep(400);
                counter.count++;
                System.out.println("COUNTER: " + counter.count);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            inc();
        }
    }
}