package Null_Empty;
import java.util.Scanner;

public class CapitalizedWordsDemo {

    // User-defined function
    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String[] words = str.split("\\s+"); // split by whitespace
        String result = "";

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize first letter + remaining letters
                result += Character.toUpperCase(word.charAt(0)) 
                        + word.substring(1).toLowerCase() + " ";
            }
        }

        return result.trim(); // remove extra space at end
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String output = capitalizeWords(input);

        System.out.println("Capitalized String: " + output);

        sc.close();
    }
}