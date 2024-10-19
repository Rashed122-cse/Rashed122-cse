
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int x = sc.nextInt();

        System.out.print("Enter the second number: ");
        int y = sc.nextInt();

        System.out.print("Enter the third number: ");
        int z = sc.nextInt();

        int largest;

        if (x > y && x > z)
            largest = x;
        else if (y > x && y > z)
            largest = y;
        else
            largest = z;

        System.out.println(largest + " is the largest number.");
    }
}
