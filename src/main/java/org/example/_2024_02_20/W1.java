package org.example._2024_02_20;

/**
 * wait - free M  and wait
 * notify - wake up -> wait()
 * notifyAll()
 */
public class W1 {
    public static void main(String[] args) {
        Market market = new Market();

        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);

        Thread T1 = new Thread(producer);
        Thread T2 = new Thread(consumer);

        T1.start();
        T2.start();
    }
}

class Market {
    private int item = 0;

    public synchronized void getItem() {
        while (item < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        item--;
        System.out.println("a person has bought one item"+ " || " + "item's count: " + item);
        notify();
    }

    public synchronized void putItem() {
        while (item >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        item++;
        System.out.println("a factory has put one item into the market" + " || " + "item's count: " + item);
        notify();
    }
}

class Producer implements Runnable {
    Market market;

    public Producer(Market market) {
        this.market =market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putItem();
        }
    }
}

class Consumer implements Runnable {
    Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getItem();
        }
    }
}