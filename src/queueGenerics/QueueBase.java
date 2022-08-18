/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueGenerics;

/**
 *
 * @author sasin
 */
public interface QueueBase<T> {

    void enqueue(T t);

    T dequeue();

    boolean isEmpty();

    boolean isFull();

    int size();
    
    void printQueue();
}
