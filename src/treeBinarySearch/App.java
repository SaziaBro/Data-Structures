/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeBinarySearch;

/**
 *
 * @author sasin
 */
public class App {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(30);
        tree.insert(40);
        tree.insert(20);
        tree.traverseInOrder();
        System.out.println(tree.get(10));
        System.out.println(tree.get(40));
        System.out.println(tree.get(44440));

        System.out.println(tree.min());
        System.out.println(tree.max());
        System.out.println("--------------------------");

        tree.traverseInOrder();
        tree.delete(40);
        System.out.println("--------------------------");
        tree.traverseInOrder();

    }
}
