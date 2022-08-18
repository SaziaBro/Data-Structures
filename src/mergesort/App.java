/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author sasin
 */
public class App {

    public static Queue mergeSort(Queue queue, Queue queue1) {
        Queue merge = new PriorityQueue();
        while (true) {
            if (!queue.isEmpty() && !queue1.isEmpty()) {
                if (Integer.parseInt(queue.peek().toString()) < Integer.parseInt(queue1.peek().toString())) {
                    merge.add(queue.poll());
                } else {
                    merge.add(queue1.poll());
                }
            } else if (!queue.isEmpty() && queue1.isEmpty()) {
                merge.add(queue.poll());
            } else if (queue.isEmpty() && !queue1.isEmpty()) {
                merge.add(queue1.poll());
            } else if (queue.isEmpty() && queue1.isEmpty()) {
                break;
            }
        }
        return merge;
    }

    public static void main(String[] args) {
        PriorityQueue queue1 = new PriorityQueue();
        PriorityQueue queue2 = new PriorityQueue();
        queue2.add(9);
        queue1.add(2);
        queue1.add(1);
        queue1.add(4);
        queue1.add(3);
        queue1.add(5);
        queue2.add(8);
        queue2.add(7);
        queue2.add(6);
        System.out.println();
        System.out.print("{");
        mergeSort(queue1, queue2).forEach((e) -> System.out.print("[" + e + "]"));
        System.out.println("}");

    }
}
