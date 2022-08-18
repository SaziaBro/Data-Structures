/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityQueue;

import java.util.NoSuchElementException;

/**
 *
 * @author sasin
 */
public interface PriorityQueueBase {

    public void insert(Node root, Node data) throws NoSuchElementException;

    public void size() throws NoSuchElementException;

    public Node remove() throws NoSuchElementException;

    public Node min() throws NoSuchElementException;
}
