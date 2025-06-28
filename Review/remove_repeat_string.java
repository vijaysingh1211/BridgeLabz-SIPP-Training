import java.util.*;
public class remove_repeat_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
       System.out.println(removeDuplicates(s));
    }
        public static String removeDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        return result;
    }
    
}
