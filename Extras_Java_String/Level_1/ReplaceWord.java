package Extras_Java_String.Level_1;

public class ReplaceWord {
    public static void main(String[] args) {
        String sentence = "Java is a good programming language";
        String oldWord = "good";
        String newWord = "great";

        String replaced = sentence.replace(oldWord, newWord);
        System.out.println("Modified Sentence: " + replaced);
    }
}
