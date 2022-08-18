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
public class AVLTree {

    Node root;

    int isBalanced(Node node) throws NullPointerException {
        if (node == null) {
            return 0;
        }
        return getHeight(node.Left) - getHeight(node.Right);
    }

    int getHeight(Node node) {
        if (node == null) {
            return 0;
        } else {
            return node.height;
        }
    }

    int recomputeHeight(Node node) {
        return 1 + Math.max(getHeight(node.Left), getHeight(node.Right));
    }

    Node swapLeft(Node node) {
        Node temp1 = node.Right;
        Node temp2 = temp1.Left;

        temp1.Left = node;
        node.Right = temp2;

        node.height = recomputeHeight(node);
        temp1.height = recomputeHeight(temp1);

        return temp1;
    }

    Node swapRight(Node node) {
        Node temp1 = node.Left;
        Node temp2 = temp1.Right;

        temp1.Right = node;
        node.Left = temp2;

        node.height = recomputeHeight(node);
        temp1.height = recomputeHeight(temp1);

        return temp1;
    }

    Node reBalance(Node node) throws NullPointerException {
        node.height = recomputeHeight(node);
        int data = node.temp;
        int balance = isBalanced(node);

        if (balance > 1 && data < node.Left.data) {
            return swapRight(node);
        } else if (balance < -1 && data > node.Right.data) {
            return swapLeft(node);
        } else if (balance > 1 && data > node.Left.data) {
            node.Left = swapLeft(node.Left);
            return swapRight(node);
        } else if (balance < -1 && data < node.Right.data) {
            node.Right = swapRight(node.Right);
            return swapLeft(node);
        }
        return node;
    }

    Node put(Node node, int data) throws NullPointerException {
        if (node == null) {
            return (new Node(data));
        }
        if (data < node.data) {
            node.Left = put(node.Left, data);
        } else if (data > node.data) {
            node.Right = put(node.Right, data);
        } else {
            return node;
        }

        node.temp = data;
        node = reBalance(node);

        return node;
    }

    Node tallerChild(Node node) {
        if (node.Left != null && node.Right != null) {
            node = (getHeight(node.Right) <= getHeight(node.Left)) ? node.Left : node.Right;
        }
        return node;
    }

    void print(Node node) throws NullPointerException {
        if (node != null) {
//            System.out.println(node);
            System.out.print(node.data + " ");
            print(node.Left);
            print(node.Right);
        } else {
            new NullPointerException("node is null");
        }
    }
}
