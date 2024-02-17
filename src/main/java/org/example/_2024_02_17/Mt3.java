package org.example._2024_02_17;

public class Mt3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("MAIN START");
        System.out.println(Thread.currentThread().getName());

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join(1);

        System.out.println("MAIN END");
    }
}
