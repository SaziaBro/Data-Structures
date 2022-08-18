/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author sasin
 */
public class App {
    public static void main(String[] args) {
        Fibonacci_recc obj = new Fibonacci_recc();
        Fibonacci_nonRec obj2 = new Fibonacci_nonRec();
        System.out.println(obj.fib(15));
    }
}
