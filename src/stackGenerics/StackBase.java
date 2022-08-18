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
public interface StackBase<T> {

    public void push(T t);

    public T pop();

    public T peek();

    public void setEmpty();

    public int getSize();

    public boolean isEmpty();
    

}
