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
public class App {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.appendFirst(1);
        list.appendFirst(2);
        list.appendFirst(2);
        list.appendFirst(2);
        list.appendLast(3);
        list.appendLast(4);
        list.appendFirst(5);
        list.displayForward();
        list.displayBackward();
        System.out.println("-------------------");
        System.out.println(list.deleteFirst().data);
        System.out.println(list.deleteLast().data);
        System.out.println(list.deleteNode(3).data);
        list.displayForward();
        System.out.println("list size is: " + list.displaySize());
        System.out.println("-------------------");
        list.deleteFirst();
        list.displayForward();
    }

}
