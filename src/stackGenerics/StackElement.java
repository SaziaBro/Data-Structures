/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackGenerics;

/**
 *
 * @author sasin
 */
public class StackElement<T> {

    StackElement<T> next;
    T value;

    public StackElement(StackElement<T> next, T value) {
        this.next = next;
        this.value = value;
    }

    public StackElement<T> getNext() {
        return next;
    }

    public T getValue() {
        return value;
    }
}
