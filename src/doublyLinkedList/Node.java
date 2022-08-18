/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublyLinkedList;

/**
 *
 * @author sasin
 */
public class Node {

    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        prev = null;
        next = null;
    }

    public void displayNode() {
        System.out.print("{" + data + "}");
    }

}
