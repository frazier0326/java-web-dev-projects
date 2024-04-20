package org.example;

public class CheckBox extends Question{
    public CheckBox (String question, Choices[] choiceArray) {
        super(question, choiceArray);
        setMaxResponses(getNumCorrect());
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return newline + "CHOOSE ONE OR MORE: " + newline + getQuestion() + newline +getFormattedChoices();
    }

    public int getNumCorrect() {
        int numCorrect = 0;
        for (Choices choice: getChoiceMap().values()) {
            if (choice.isCorrect()) {
                numCorrect++;
            }
        }
        return numCorrect > 0 ? numCorrect : getChoiceMap().size();
    }
}
