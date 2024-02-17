package org.example._2024_02_17;

/**
 * - new Thread(TASK).start()
 * - impl Runnable
 * - impl Callable
 */
public class Mt4 {
    public static void main(String[] args) throws InterruptedException {
        Thread TH = new Thread();
        System.out.println(TH.getState());
        TH.start();
        System.out.println(TH.getState());


        System.out.println(TH.getName());

        Thread.sleep(2500);
        System.out.println(TH.getState());

    }
}


