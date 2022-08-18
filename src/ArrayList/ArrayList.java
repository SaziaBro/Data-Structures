/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.lang.reflect.Array;

/**
 *
 * @author sasin
 */
public class ArrayList<T> {

    private T[] arrayList;
    private int elementsInArray;
    private Class<T> clazz;

    public ArrayList(Class<T> c, int capacity) {
        this.clazz = c;
        if (capacity <= 0) {
            return;
        }

        this.arrayList = (T[]) Array.newInstance(c.getClass(), capacity);
        this.elementsInArray = 0;
    }

    public ArrayList(Class<T> c) {
        this(c, 10);
    }

    public void add(T x) {
        if (checkIfArrayFull()) {
            copyArray(0, "double");
        }

        this.arrayList[elementsInArray] = x;
        this.elementsInArray++;
    }

    public void add(int index, T x) {
        if (checkIfArrayFull()) {
            copyArray(0, "double");
        }

        if (index >= this.arrayList.length) {
            System.out.println("The index is out of bounds");
            System.exit(-1);
        }

        T temp = this.arrayList[index];
        arrayList[index] = x;

        T temp2;

        for (int i = index; i < this.arrayList.length - 1; i++) {
            temp2 = arrayList[i + 1];
            arrayList[i + 1] = temp;
            temp = temp2;
        }

        copyArray(0, "");
        this.elementsInArray++;
    }

    public T get(int index) {
        T element = null;

        try {
            element = this.arrayList[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        return element;
    }

    public int size() {
        return this.elementsInArray;
    }

    public boolean isEmpty() {
        return this.elementsInArray == 0;
    }

    public boolean isIn(T ele) {
        return find(ele) >= 0;
    }

    public int find(T ele) {
        for (int i = 0; i < this.arrayList.length; i++) {
            if (ele.equals(this.arrayList[i])) {
                return i;
            }
        }

        return -1;
    }

    public void remove(T element) {
        for (int i = 0; i < this.elementsInArray; i++) {
            if (element.equals(this.arrayList[i])) {
                this.arrayList[i] = null;
                this.elementsInArray--;
                copyArray(0, "");
                return;
            }
        }
    }

    private boolean checkIfArrayFull() {
        return this.arrayList.length == this.elementsInArray;
    }

    private void copyArray(int size, String action) {
        size = increaseArraySize(size, action);
        T[] tempArray = (T[]) Array.newInstance(clazz.getClass(), size);

        int tempElement = 0;

        for (int i = 0; i < this.arrayList.length; i++, tempElement++) {
            if (this.arrayList[i] == null) {
                tempElement--;
                continue;
            }

            tempArray[tempElement] = this.arrayList[i];
        }

        this.arrayList = null;
        this.arrayList = (T[]) Array.newInstance(clazz.getClass(), tempArray.length);
        this.arrayList = tempArray;
    }

    private int increaseArraySize(int size, String action) {
        if (action.equals("double")) {
            size = this.arrayList.length * 2;
        } else {
            size = this.arrayList.length + size;
        }

        return size;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("[");
        for (T object : arrayList) {
            string.append(object).append(",");
        }
        string.deleteCharAt(string.length() - 1);
        string.append("]");
        return string.toString();
    }

}
