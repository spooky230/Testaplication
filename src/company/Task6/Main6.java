package company.Task6;

import company.Task6.List.ListImpl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {
        ListImpl<String>stringList = new ListImpl<>();
        printMemory("START WITH JAVA LINKED LIST");
        LinkedList<String> strings = new LinkedList<>();
        for (int i = 0; i < 2_000_000; i++) {
            strings.add("AAA");
            strings.add("BBB");
            strings.add("CCC");
            strings.add("DDD");
        }
        printMemory("ADDED WITH JAVA LINKED LIST");
        System.out.println(strings.get(10));
        System.out.println(strings.get(20));
        for (int i = 0; i < 2_000_000; i++) {
            strings.removeLast();
            strings.removeLast();
            strings.removeLast();
            strings.removeLast();
        }
        System.gc();
        printMemory("removed WITH JAVA LINKED LIST");

        printMemory("START WITH CUSTOM LINKED LIST");
        for (int i = 0; i < 2_000_000; i++) {
            stringList.addLast("AAA");
            stringList.addLast("BBB");
            stringList.addLast("CCC");
            stringList.addLast("DDD");
        }
        printMemory("ADDED WITH CUSTOM LINKED LIST");
        System.out.println(stringList.get(10));
        System.out.println(stringList.get(20));
        for (int i = 0; i < 2_000_000; i++) {
            stringList.removeLast();
            stringList.removeLast();
            stringList.removeLast();
            stringList.removeLast();
        }
        System.gc();
        printMemory("removed CUSTOM JAVA LINKED LIST");
    }
    private static void printMemory(String comment) {
        Runtime runtime = Runtime.getRuntime();
        long free = runtime.freeMemory();
        long total = runtime.totalMemory();
        Memory start = new Memory(free,total);
        System.out.println(comment + start.toString());
    }
}
