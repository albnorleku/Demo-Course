package com.javaCourse.controlFlows;

import java.util.Scanner;

public class ExamplesWithLoops {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a word: ");
        //char[] a = scanner.next().toCharArray();
        String word = scanner.next();

        int position = matchTheWord(word);
        String message = position == -1 ? "Nuk u gjet fjal ne array" : "Fjala u gjet ne poziten: " + position;
        System.out.println(message);
    }

    public static int matchTheWord(String word) {
        String [] words = {"Hi", "hello", "goodbye", "tung"};
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }

    // todo accept 5 integer from scanner with loops add only odd numbers and print the result.
}
