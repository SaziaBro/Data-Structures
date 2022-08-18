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
public class App {

    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue(7);
        Node root = new Node();
        queue.insert(root, new Node(5));
        queue.insert(root, new Node(8));
        queue.insert(root, new Node(7));
        queue.insert(root, new Node(9));
        queue.insert(root, new Node(2));
        queue.insert(root, new Node(9));
        queue.insert(root, new Node(-2));

        queue.size();

        queue.remove();
        queue.size();

        queue.remove();
        queue.size();
    }
}
