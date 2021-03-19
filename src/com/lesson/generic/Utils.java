package com.lesson.generic;

public class Utils {
    public static <T> void printItems(T[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.println("item No "+(i+1)+" = " + items[i]);
        }
    }
}
