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
public class Fibonacci_nonRec {

    public int nonRec(int a) {
        int n1 = 0, n2 = 1, n3, i, max = 9;
        System.out.print(n1 + " " + n2);
        for (i = 2; i < max; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        return n2;
    }
}
