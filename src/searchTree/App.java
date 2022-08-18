/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchTree;

/**
 *
 * @author sasin
 */
public class App {

    public static void main(String[] args) {
        AVLTree avl = new AVLTree();
        avl.root = avl.put(avl.root, 10);
        avl.root = avl.put(avl.root, 20);
        avl.root = avl.put(avl.root, 25);
        avl.root = avl.put(avl.root, 30);
        avl.root = avl.put(avl.root, 40);
        avl.root = avl.put(avl.root, 50);

//        System.out.println("isBalanced: " + avl.isBalanced(avl.root));
//        System.out.println("getHeight: " + avl.getHeight(avl.root));
//        System.out.println("swapLeft: " + avl.swapLeft(avl.root));
//        System.out.println("swapRight: " + avl.swapRight(avl.root));
//        System.out.println("tallerChild: " + avl.tallerChild(avl.root));

        avl.print(avl.root);

    }

}
