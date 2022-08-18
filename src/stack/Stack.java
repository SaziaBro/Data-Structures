/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author sasin
 */
public class Stack {

    private int maxSize, top;
    private long[] stackArray;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long n) {
        if (isFull()) {
            System.out.println("Already full!");
        } else {
            top++;
            stackArray[top] = n;
        }
    }

    public long pop() {
        if (isEmpty()) {
            System.out.println("already empty");
            return -1;
        } else {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
    }

    public long peak() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (maxSize - 1 == top);
    }
}
