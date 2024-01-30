import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.nextLine();
        String reverseStr = "";

        int length = str.length();

        for (int i = length - 1; i >= 0; i--) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.equals(reverseStr)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
