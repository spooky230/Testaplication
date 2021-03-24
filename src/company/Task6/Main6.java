package company.Task6;

import company.Task6.List.ListImpl;

public class Main6 {
    public static void main(String[] args) {
        ListImpl<String>stringList = new ListImpl<>();
        stringList.addLast("AAA");
        stringList.addLast("BBB");
        stringList.addLast("CCC");
        stringList.addLast("DDD");
        System.out.println(stringList.get(-10));
        System.out.println(stringList.get(-20));
    }
}
