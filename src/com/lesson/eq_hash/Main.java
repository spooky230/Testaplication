package com.lesson.eq_hash;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ClientAdequateEquals adequateEquals = new ClientAdequateEquals("Jacob","USA");
        ClientAdequateEquals cloneA = adequateEquals.clone();
        adequateEquals.getPurchases().add("potato");
        adequateEquals.getPurchases().add("tomato");
        System.out.println(adequateEquals.getPurchases().equals(cloneA.getPurchases()));
        System.out.println(adequateEquals.equals(cloneA));
        cloneA.setName("John");
        System.out.println(adequateEquals.equals(cloneA));



        ClientFullEquals fullEquals = new ClientFullEquals("Jacob","USA");
        ClientFullEquals cloneB = fullEquals.clone();
        fullEquals.getPurchases().add("potato");
        fullEquals.getPurchases().add("tomato");
        System.out.println(fullEquals.getPurchases().equals(cloneB.getPurchases()));
        System.out.println(fullEquals.equals(cloneB));
        cloneB.setName("John");
        System.out.println(fullEquals.equals(cloneB));
    }
}
