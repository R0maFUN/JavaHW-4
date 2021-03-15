package com.company;

public class LetterCounterBuilder {
    public LetterCounterBuilder() {}

    public LetterCounter build() {
        return new LetterCounter(inputFName, outputFName);
    }

    public LetterCounterBuilder inputFileName(String fname) {
        this.inputFName = fname;
        return this;
    }

    public LetterCounterBuilder outputFileName(String fname) {
        this.outputFName = fname;
        return this;
    }

    private String inputFName = "input.txt";
    private String outputFName = "output.txt";
}
