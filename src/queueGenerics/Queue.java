/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueGenerics;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;

/**
 *
 * @author sasin
 */
public class Queue<T> implements QueueBase<T> {

    private T elements[];
    private int front, rear;
    private int size, maxQueueSize;

    public Queue(int maxQueueSize, Class<T> classType) {
        this.maxQueueSize = maxQueueSize;
        front = 0;
        rear = -1;
        elements = (T[]) Array.newInstance(classType, maxQueueSize);
    }

    @Override
    public void enqueue(T t) {
        if (isFull()) {
            return;
        }
        if (rear == maxQueueSize - 1) {
            int count = 0;
            for (int i = front; i < rear; i++) {
                elements[count++] = elements[i];
            }
            front = 0;
            rear = size - 1;
        }
        elements[++rear] = t;
        size++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T element = elements[front];
        elements[front] = null;
        front++;
        size--;
        return element;

    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == maxQueueSize;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printQueue() {
        if (isEmpty()) {
            return;
        }
        for (T element : elements) {
            System.out.println(element);
        }
    }

}
