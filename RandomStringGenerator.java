package Null_Empty;
import java.util.Scanner;
import java.util.Random;

public class RandomStringGenerator {

    // User-defined function
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();

        String result = "";

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            result += characters.charAt(index);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter desired length: ");
        int length = sc.nextInt();

        String randomString = generateRandomString(length);

        System.out.println("Generated Random String: " + randomString);

        sc.close();
    }
}