/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author sasin
 */
public class App {

    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.insert(10);
        q.insert(20);
        q.insert(60);
        q.insert(30);
        q.insert(40);
        q.display();
    }

}
