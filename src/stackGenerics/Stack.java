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
public class Stack<T> implements StackBase<T> {

    private int size;
    private StackElement<T> top;

    public Stack() {
        size = 0;
        top = null;
    }

    @Override
    public void push(T t) {
        StackElement<T> element = new StackElement<>(top, t);
        top = element;
        size++;
    }

    @Override
    public T pop() {
        StackElement<T> old = top;
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        top = top.getNext();
        size--;
        return old.getValue();
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new NullPointerException();
        }
        return top.getValue();
    }

    @Override
    public void setEmpty() {
        size = 0;
        top = null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

}
