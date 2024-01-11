package org.example._2024_01_11;

import java.util.concurrent.ArrayBlockingQueue;

public class QueueEx {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);

        Thread producer = new Thread(() -> {
            String[] words = {"qwe", "wer", "ert", "rty", "tyu", "yui", "uio"};

            for (int i = 0; i < words.length && !Thread.interrupted();) {
                try {
                    Thread.sleep(1500);
                    queue.put(words[i]);
                    System.out.println("Producer produce: " + words[i]);
                    System.out.println("Queue size: " + queue.size());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                i++;
            }
        });

        Thread consumer = new Thread(() -> {
            StringBuilder sb = new StringBuilder();
            while (!Thread.interrupted()) {
                try {
                    sb.setLength(0);
                    Thread.sleep(5000);
                    sb.append(queue.take());
                    System.out.println("Consumer consume: " + sb.reverse());
                    System.out.println("Queue size: " + queue.size());

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        producer.start();
        consumer.start();
    }
}