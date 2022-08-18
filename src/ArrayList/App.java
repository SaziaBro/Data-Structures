/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

/**
 *
 * @author sasin
 */
public class App {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>(Student.class);
        list.add(new Student(1, "A", "B"));
        list.add(new Student(2, "C", "D"));
        list.add(new Student(3, "E", "F"));
        System.out.println(list);
    }
}
