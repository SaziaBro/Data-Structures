/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinglyLinkedList;

/**
 *
 * @author sasin
 */
public class SinglyLinkedList {

    Node head;

    public SinglyLinkedList(Node head) {
        this.head = head;
    }

    void appendToEnd(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = n;
        }
    }

    void appendToStart(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    void appendToAfter(int insertAfter, int data) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == insertAfter) {
                Node n = new Node(data);
                n.next = curr.next;
                curr.next = n;
                break;
            }
            curr = curr.next;
        }
    }

    Node deleteLast() {
        Node curr = head;
        if (curr == null || curr.next == null) {
            head = null;
            return curr;
        }
        Node nextNode = curr.next;
        while (curr.next != null) {
            if (nextNode.next != null) {
                curr.next = null;
            }
            curr = nextNode;
            nextNode = nextNode.next;
        }
        return curr;
    }

    Node deleteFirst() {
        if (head != null) {
            Node toDelete = head;
            head = head.next;
            return toDelete;
        }
        return null;
    }

    Node deleteAfter(int data) {
        Node curr = head;
        Node toDelete = null;
        while (curr != null) {
            if (curr.data == data && curr.next != null) {
                toDelete = curr.next;
                curr.next = toDelete.next;
                break;
            }
            curr = curr.next;
        }
        return toDelete;
    }

    void delete(int data) {
        Node curr = head;
        Node prev = null;
        if (curr == null) {
            return;
        } else if (curr != null && curr.data == data) {
            head = curr.next;
            return;
        }
        while (curr != null && curr.data != data) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = curr.next;
    }

    public void display() {

        Node curr = head;
        while (curr != null) {
            curr.displayNode();
            curr = curr.next;
        }
        System.out.println();
    }

    public void size() {

        Node curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        System.out.println("Size: " + count);

    }
}
