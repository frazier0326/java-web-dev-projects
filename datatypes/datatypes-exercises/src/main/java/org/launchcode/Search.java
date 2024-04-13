package org.launchcode;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or " +
                "conversation?’";
        String word;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word to search for:");
        word = input.nextLine();
        System.out.println(quote.toLowerCase().contains(word.toLowerCase()));

        int index = quote.indexOf(word);
        int length = word.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length +
        " characters long.");
        String modifiedSentence = quote.replace(word, "");
        System.out.println(modifiedSentence);
    }
}
