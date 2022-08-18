/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author sasin
 */
public class Queue {

    private int maxSize, front, rear, nItems;
    private long[] queArray;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long n) {
        if (rear == maxSize - 1) {
            rear = -1;
        } else {
            rear++;
            queArray[rear] = n;
            nItems++;
        }
    }

    public long removeFront() {
        long temp = queArray[front];
        front++;
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (maxSize == nItems);
    }

    public void display() {
        System.out.print("[ ");
        for (int i = 0; i < queArray.length; i++) {
            System.out.print(queArray[i] + " ");
        }
        System.out.println(" ]");
    }

}
