package org.example._2024_01_11;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public interface MyQueueInterface<E> {

    boolean add(E e);

    /**
     * Retrieves and removes the head of this queue,
     * or returns {@code null} if this queue is empty.
     *
     * @return the head of this queue, or {@code null} if this queue is empty
     */
    E poll();


    /**
     * Retrieves, but does not remove, the head of this queue,
     * or returns {@code null} if this queue is empty.
     *
     * @return the head of this queue, or {@code null} if this queue is empty
     */
    E peek();
}

class MuQueueImpl<E> implements MyQueueInterface<E> {
    private ArrayList<E> list = new ArrayList<>();

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }
}
