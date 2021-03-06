package com.lesson.generic;

public class Account<T> {
    private T id;
    private int sum;

    Account(T id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", sum=" + sum +
                '}';
    }
}
