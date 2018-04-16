package alg;

import java.util.Arrays;

/**
 * Description:
 * Write a program to implement your own ArrayList class. It should
 * contain add(), get(), remove(), size() methods. Use dynamic array logic.
 * It should increase its size when it reaches threshold.
 */
public class MyArrayList {
    private static final int THRESHOLD = 5;
    private Object[] data;
    private int actualSize = 0;

    public MyArrayList() {
        data = new Object[10];
    }

    public int size() {
        return actualSize;
    }

    public Object get(final int i) {
        if (i >= actualSize) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return data[i];
    }

    public void add(final Object element) {
        if (data.length - actualSize < THRESHOLD) {
            increaseListSize();
        }
        data[actualSize++] = element;
    }

    public Object remove(final int index) {
        if (index >= actualSize) {
            throw new ArrayIndexOutOfBoundsException();
        }
        final Object datum = data[index];

        for (int i = index; i < actualSize; i++) {
            data[i] = data[i + 1];
        }
        data[--actualSize] = null;
        return datum;
    }

    private void increaseListSize() {
        data = Arrays.copyOf(data, data.length * 2);
    }

    public static void main(String... args){
        final MyArrayList list = new MyArrayList();
        list.add(2);
        list.add(5);
        list.add(14);
        list.add(23);
        System.out.println(list);
    }
}
