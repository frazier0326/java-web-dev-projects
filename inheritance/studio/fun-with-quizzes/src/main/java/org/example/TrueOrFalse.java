package org.example;

public class TrueOrFalse extends Question {
    public TrueOrFalse(String question, Choices[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return newline + "TRUE OR FALSE " + newline + getQuestion() + newline +getFormattedChoices();
    }
}
