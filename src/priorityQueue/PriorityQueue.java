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
public class PriorityQueue implements PriorityQueueBase {

    private Node[] array;
    private int pos = 0;

    public PriorityQueue(int maxSize) {
        array = new Node[maxSize];
    }

    @Override
    public void insert(Node root, Node node) throws NoSuchElementException {
        if (array.length <= 0) {
            throw new NoSuchElementException();
        }
        if (pos + 1 > array.length) {
            throw new NoSuchElementException();
        }
        array[pos] = node;
        ++pos;
        min();
    }

    @Override
    public void size() throws NoSuchElementException {
        if (array.length <= 0) {
            throw new NoSuchElementException();
        }
        for (Node node : array) {
            System.out.println(node);
        }
    }

    @Override
    public Node remove() throws NoSuchElementException {
        if (array.length <= 0) {
            throw new NoSuchElementException();
        }
        if (pos <= 0) {
            throw new NoSuchElementException();
        }

        Node tmp_n = array[0];

        for (int i = 0; i < pos; i++) {
            if (i + 1 > pos - 1) {
                array[i] = null;
                break;
            }

            int t = array[i].data;
            array[i].data = array[i + 1].data;
            array[i + 1].data = t;
        }
        --pos;
        return tmp_n;
    }

    @Override
    public Node min() throws NoSuchElementException {
        if (array.length <= 0) {
            throw new NoSuchElementException();
        }

        int child = pos - 1,
                parent = child / 2;

        while (true) {

            if (array[parent].data > array[child].data) {
                int t = array[parent].data;
                array[parent].data = array[child].data;
                array[child].data = t;
            } else {
                break;
            }
            child = parent;
            parent = child / 2;
        }
        return array[0];
    }

}
