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
public class Node {

    int data, temp;
    int height;
    Node Left, Right;

    public Node(int data) {
        height = 1;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" + "data=" + data + ", height=" + height + ", Left=" + Left + ", Right=" + Right + '}';
    }
}
