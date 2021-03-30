package org.example.labs.lab13;

import java.util.Arrays;


public class MyIntCollection <T>{
    private T[] items = (T[]) new Object[4];
    private int length;

    public MyIntCollection() {
        this.length = 0;
    }

    private void setLength(int length) {
        this.length = length;
    }

    public void add(T item){
        if (length == items.length){
            doubleItems();
        }
        items[length++] = item;
    }

    private void doubleItems(){
        T[] itemCopy = items;
        items = (T[]) new Object[items.length*2];

        for (int i = 0; i < itemCopy.length; i++) {
            items[i] = itemCopy[i];
        }
    }

    public T[] getItems() {
        return items;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "MyIntCollection{" +
                "items=" + Arrays.toString(items) +
                '}';
    }
}
