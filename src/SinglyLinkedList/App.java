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
public class App {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList(new Node(4));
        list.appendToStart(5);
        list.appendToStart(5);
        list.appendToStart(5);
        list.appendToStart(5);
        list.appendToEnd(10);
        list.appendToEnd(10);
        list.appendToAfter(10, 19);
        list.display();
        System.out.println("```````````````````````");
        list.delete(10);
        
        list.size();
        System.out.println("```````````````````````");
        list.delete(5);
        list.display();
        

    }
}
