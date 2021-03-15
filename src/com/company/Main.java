package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the input filename: ");
        Scanner in = new Scanner(System.in);
        String userInFilename = in.nextLine();

        LetterCounter counter = new LetterCounterBuilder()
                                        .inputFileName(userInFilename)
                                        .build();
        counter.countLetters();
    }
}
