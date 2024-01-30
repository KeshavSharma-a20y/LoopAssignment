import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int n = scan.nextInt();
        System.out.println();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of natural numbers up to " + n + " is " + sum);
    }
}
