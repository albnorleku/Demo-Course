package com.javaCourse.helloWorld;

public class ChainMethodExample {
    private int number = 0;

    public ChainMethodExample() {
    }

    public ChainMethodExample(int nr) {
        this.number = nr;
    }

    public ChainMethodExample addNr(int nr) {
        this.number += nr;
        System.out.println(this.number);
        return this;
    }

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        ChainMethodExample chainMethodExample = new ChainMethodExample(); //nr is 0;
        chainMethodExample.addNr(3)
                .addNr(5)
                .addNr(7);

        System.out.println(chainMethodExample.getNumber());
    }
}
