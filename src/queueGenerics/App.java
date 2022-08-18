/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueGenerics;

/**
 *
 * @author sasin
 */
public class App {

    public static void main(String[] args) {
        Queue<Student> queue = new Queue<>(5, Student.class);
        queue.enqueue(new Student(1, "Hasiya", "ponnanbalam"));
        queue.enqueue(new Student(2, "kumudu", "liyanage"));
        queue.enqueue(new Student(3, "roshana", "madamandula"));
        queue.enqueue(new Student(4, "wolf", "aponso"));

        queue.printQueue();
        queue.dequeue();
        queue.dequeue();
        System.out.println("<------------>");
        queue.printQueue();
    }

}
