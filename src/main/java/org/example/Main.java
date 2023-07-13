package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main<T> {
    private List<T> elements;

    public Main() {
        elements = new ArrayList<>();
    }

    public void add(T element) {
        if (!contains(element)) {
            elements.add(element);
        }
    }
    public boolean contains(T element) {
        return elements.contains(element);
    }
    public String toString() {
        return elements.toString();
    }
    public static void main(String[] args) {
        Main<Integer> set = new Main<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(3);
        System.out.println(set.toString());
    }
}