package com.lesson.generic;

public class Main {
    public static void main(String[] args) {

        Account<String> acc1 = new Account<>("tdb6rrbifntm", 5000);
        String acc1Id = acc1.getId();
        System.out.println(acc1Id);

        Account<Integer> acc2 = new Account<>(2345, 5000);
        Integer acc2Id = acc2.getId();
        System.out.println(acc2Id);
        Utils.printItems(new Account[]{acc1, acc2});
        Utils.printItems(new Double[]{27.64, 166.,544.2});
        Utils.printItems(new String[]{"line0", "Mars","tomato","cat"});
        Hint<String,Integer> purchase = new Hint<>("tomato",50);
        Hint<String,Double>
    }
}
