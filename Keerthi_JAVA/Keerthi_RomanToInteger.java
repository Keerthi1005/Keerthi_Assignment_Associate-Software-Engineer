import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();
        int integerValue = romanToInteger(romanNumeral);
        System.out.println("Integer value: " + integerValue);
        System.out.print("Enter a sentence to check for pangram:");
        String sentence = scanner.nextLine().toLowerCase();
        boolean isPangram = checkPangram(sentence);
        System.out.println("Is it a pangram? " + isPangram);
    }

    private static int romanToInteger(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = getValue(s.charAt(i));
            int next = (i + 1 < s.length()) ? getValue(s.charAt(i + 1)) : 0;
            if (current >= next) {
                result += current;
            } else {
                result += (next - current);
                i++;
            }
        }
        return result;
    }

    private static int getValue(char romanDigit) {
        switch (romanDigit) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    private static boolean checkPangram(String sentence) {
        boolean[] alphabet = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (Character.isLetter(ch)) {
                alphabet[ch - 'a'] = true;
            }
        }
        for (boolean present : alphabet) {
            if (!present) {
                return false;
            }
        }
        return true;
    }
}