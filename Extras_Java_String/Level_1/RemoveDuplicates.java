package Extras_Java_String.Level_1;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        String result = "";

        for (char c : str.toCharArray()) {
            if (result.indexOf(c) == -1)
                result += c;
        }

        System.out.println("String without duplicates: " + result);
    }
}
