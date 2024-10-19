import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer (n): ");
        int num = input.nextInt();

        int oddsum = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) { // Check if the number is odd
                oddsum += i;
            }
        }

        System.out.println("Sum of odd numbers from 1 to " + num + " is: " + oddsum);

        input.close();
    }
}
