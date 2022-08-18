/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bruteForceSearch;

/**
 *
 * @author sasin
 */
public class App {

    public static int executeBruteForce(String text, String pattern) {
        char[] charArray = text.toCharArray();
        char[] patternArray = pattern.toCharArray();
        int textlength = charArray.length;
        int patternLength = patternArray.length;

        for (int i = 0; i <= textlength - patternLength; i++) {
            int k = 0;
            while (k < patternLength && charArray[i + k] == patternArray[k]) {
                k++;
                if (k == patternLength) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(executeBruteForce("Hi, this is me", "me"));
    }
}
