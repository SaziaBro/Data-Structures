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
public class App {

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.appendFirst(2);
        list.appendFirst(3);
        list.appendFirst(4);
        list.appendFirst(5);
        list.appendLast(10);
        list.appendLast(20);
        list.appendLast(30);
        list.displayList();
        System.out.println("initiating delete");
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        System.out.println("-----------------");
        list.displayList();
        System.out.println("-----------------");
        System.out.println(list.deleteNode(2));
        System.out.println("-----------------");
        list.displayList();
        
    }
}
