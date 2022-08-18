/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularLinkedList;

/**
 *
 * @author sasin
 */
public class CircularLinkedList {

    private Node first, last;

    public CircularLinkedList() {
        first = null;
        last = null;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public void appendFirst(int data) {
        Node n = new Node(data);
        if (isEmpty()) {
            last = n;
        }
        n.next = first;
        first = n;
    }

    public void appendLast(int data) {
        Node n = new Node(data);
        if (isEmpty()) {
            first = n;
        } else {
            last.next = n;
            last = n;
        }
    }

    public int deleteFirst() {
        int temp = first.data;
        if (first.next != null) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public int deleteLast() {
        Node prev = null;
        Node curr = first;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        return prev.data;

    }

    public int deleteNode(int key) {
        Node curr = first;
        Node prev = null;
        while (curr.data != key) {
            prev = curr;
            curr = curr.next;
            if (curr == null) {
                return -1;
            }
        }
        prev.next = curr.next;
        return curr.data;
    }

    public void displayList() {
        System.out.println("List(First---->Last)");
        Node curr = first;
        while (curr != null) {
            curr.displayNode();
            curr = curr.next;
        }
        System.out.println();
    }
}
