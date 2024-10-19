import java.util.Scanner;

public class BitEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number: ");
        int number = input.nextInt();
        if ((number & 1) == 1){
            System.out.println("Odd number");
        }
        else {
            System.out.println("Even number");
        }
    }
}
