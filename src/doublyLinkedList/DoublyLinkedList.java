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
public class DoublyLinkedList {

    private Node first, last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void appendFirst(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            last = node;
        } else {
            first.prev = node;
        }
        node.next = first;
        first = node;
    }

    public void appendLast(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            first = node;
        } else {
            last.next = node;
            node.prev = last;
        }
        last = node;
    }

    public Node deleteFirst() {
        Node temp = first;

        if (first.next == null) {
            last = null;
        } else {
            first.next.prev = null;
        }
        first = first.next;
        return temp;
    }

    public Node deleteLast() {
        Node temp = last;
        if (first.next == null) {
            first = null;
        } else {
            last.prev.next = null;
        }
        last = last.prev;
        return temp;
    }

    public boolean appendAfter(int key, int data) {
        Node curr = first;
        while (curr.data != key) {
            curr = curr.next;
            if (curr.next == null) {
                return false;
            }
        }
        Node n = new Node(data);
        if (curr == last) {
            curr.next = null;
            last = n;
        } else {
            n.next = curr.next;
            curr.next.prev = n;
        }
        n.prev = curr;
        curr.next = n;
        return true;
    }

    public Node deleteNode(int key) {
        Node curr = first;
        while (curr.next.data != key) {
            curr = curr.next;
            if (curr == null) {
                return null;
            }
        }
        if (curr == first) {
            first = curr.next;
        } else {
            curr.prev.next = curr.next;
        }
        if (curr == last) {
            last = curr.prev;
        } else {
            curr.next.prev = curr.prev;
        }
        return curr;
    }

    public void displayForward() {
        System.out.println("List(First---->Last)");
        Node curr = first;
        while (curr != null) {
            curr.displayNode();
            curr = curr.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        System.out.println("List(Last---->First)");
        Node curr = last;
        while (curr != null) {
            curr.displayNode();
            curr = curr.prev;
        }
        System.out.println();
    }

    public int displaySize() {
        Node curr = first;
        int size = 0;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        return size;
    }
}
