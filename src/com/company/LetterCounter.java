package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.Character.*;
import java.io.FileWriter;
import java.io.IOException;

public class LetterCounter {
    public LetterCounter(String inpFilename, String outFilename) {
        inputFileName = inpFilename;
        outputFileName = outFilename;
        values = new int['z' - 'a' + 1];
    }

    public void countLetters() {
        try {
            File inputFile = new File(inputFileName);
            Scanner scan = new Scanner(inputFile);
            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                for(int i = 0; i < data.length(); ++i) {
                    char ch = Character.toLowerCase(data.charAt(i));
                    if(ch >= 'a' && ch <= 'z')
                    values[ch - 'a']++;
                }
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Incorrect input filename");
            e.printStackTrace();
        }

        for(int i = 0; i < values.length; ++i) {
            String outLine = (char)('a' + i) + " : " + values[i];
            System.out.println(outLine);
        }

        try {
            FileWriter out = new FileWriter(outputFileName);
            for(int i = 0; i < values.length; ++i) {
                String outLine = (char)('a' + i) + " : " + values[i] + "\n";
                out.write(outLine);
            }
            out.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }

    private String inputFileName;
    private String outputFileName;
    int[] values;
}
