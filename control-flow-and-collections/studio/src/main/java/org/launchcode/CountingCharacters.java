package org.launchcode;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        //File file = new File(/Users/tforsythe/Documents/Java_String_Practice.rtf);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String str = scanner.nextLine().toLowerCase(Locale.ROOT).replaceAll("[^a-zA-Z]", "");
//HashMap char as a key and occurrence as a value
        HashMap <Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < str.length() - 1; i++) {
        //for (int i = str.length() - 1; i >= 0; i--) {
            if(charCount.containsKey(str.charAt(i))) {
                int count = charCount.get(str.charAt(i));
                charCount.put(str.charAt(i), ++count);
            } else {
                charCount.put(str.charAt(i),1);
            }
        }
        System.out.println(charCount);
    }
}
