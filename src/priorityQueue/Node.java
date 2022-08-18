/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityQueue;

/**
 *
 * @author sasin
 */
public class Node {

    int data;
    Node leftNode = null;
    Node rightNode = null;

    public Node(int data) {
        this.data = data;
    }

    public Node() {
    }

    @Override
    public String toString() {
        return "Node{" + "data=" + data + ", leftNode=" + leftNode + ", rightNode=" + rightNode + '}';
    }

}
