package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class SoNguyen {
    int[] ds;
    int maxSize;
    int currentSize = 0;

    public SoNguyen(int maxSize) {
        this.maxSize = maxSize;
        ds = new int[maxSize];
    }

    //default size = 255
    public SoNguyen() {
        this.maxSize = 255;
        ds = new int[maxSize];
    }

    public void add(int x) {
        if (currentSize == maxSize) System.out.println("Failed to add, list is full");
        else {
            ds[currentSize] = x;
            currentSize++;
        }
    }

    public void remove(Function<Integer, Boolean> fn) {
        if (currentSize == 0) return;
        int[] tmp = new int[maxSize];
        int k = 0;
        for (int i = 0; i < currentSize; i++)
            if (!fn.apply(ds[i])) {
                tmp[k] = ds[i];
                k = k + 1;
            }
        ds = tmp;
        currentSize = k;
    }

    public String toString() {
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < currentSize; i++) {
            tmp.append(ds[i]).append(" ");
        }
        return tmp.toString();
    }

    public void parseAndAdd(String input) {
        List<String> tmp = new ArrayList<>(Arrays.asList(input.split(" ")));
        for (String i : tmp) {
            this.add((Integer.parseInt(i)));
        }
    }

}
