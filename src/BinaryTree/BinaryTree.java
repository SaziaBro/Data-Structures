/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

import java.util.NoSuchElementException;

/**
 *
 * @author sasin
 */
public class BinaryTree {

    private Node Node_root;

    public Node addLeft(Node n, Node e) throws NoSuchElementException {
        if (Node_root == null) {
            throw new NoSuchElementException("Root node hasn't been declared!");
        } else {
            if (n.leftNode != null) {
                throw new NoSuchElementException("Can't add to leaf Nodes");
            } else {
                n.leftNode = e;
            }
        }
        return n;
    }

    public Node addRight(Node n, Node n1) throws NoSuchElementException {
        if (Node_root == null) {
            throw new NoSuchElementException("Root node hasn't been declared!");
        } else {
            if (n.rightNode != null) {
                throw new NoSuchElementException("Can't add to leaf Nodes");
            } else {
                n.rightNode = n1;
            }
        }
        return n;
    }

    public Node addRoot(Node n) {
        if (Node_root == null) {
            return Node_root = n;
        }
        return Node_root;
    }

    public Node set(Node n, Node n1) throws NoSuchElementException {
        if (n.leftNode != null || n.rightNode != null) {
            throw new NoSuchElementException("Can't set to leaf Nodes");
        } else {
            n = n1;
        }
        return n;
    }

    public Node attach(Node n, BinaryTree b1, BinaryTree b2) throws NullPointerException {
        if (n.leftNode == null) {
            n.leftNode = b1.Node_root;
        } else {
            throw new NullPointerException();
        }
        if (n.rightNode == null) {
            n.rightNode = b2.Node_root;
        } else {
            throw new NullPointerException();
        }
        return n;
    }

    public void remove(Node n) throws NullPointerException {
        if (n != null) {
            n.leftNode = null;
            n.rightNode = null;
            n = null;
        } else {
            throw new NullPointerException("Empty node");
        }

    }

}
