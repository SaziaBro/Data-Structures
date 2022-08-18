/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackGenerics;

/**
 *
 * @author sasin
 */
public class App {

    public static void main(String[] args) {
        Stack<Student> stack = new Stack();
        stack.push(new Student(1, "Hasiya", "ponnanbalam"));
        stack.push(new Student(2, "kumudu", "liyanage"));
        stack.push(new Student(3, "roshana", "madamandula"));
        stack.push(new Student(4, "wolf", "aponso"));
        System.out.println(stack.peek());
        System.out.println(stack.getSize());
        System.out.println(stack.pop());
        System.out.println(stack.getSize());
        System.out.println(stack.peek());
    }
}
