/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

/**
 *
 * @author sasin
 */
public class App {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node rootNode = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        tree.addRoot(rootNode);
        tree.addLeft(rootNode, node2);
        tree.addRight(rootNode, node3);
        tree.addLeft(node3, new Node(4));

        BinaryTree tree1 = new BinaryTree();
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);

        tree1.addRoot(node5);
        tree1.addLeft(node6, new Node(15));
        tree1.addLeft(node7, new Node(19));
        tree1.addRight(node7, node8);
        tree1.addLeft(node8, new Node(20));

        tree1.remove(node8);

        BinaryTree tree2 = new BinaryTree();
        Node addRoot = tree2.addRoot(new Node(100));
        tree2.attach(addRoot, tree, tree1);
    }
}
