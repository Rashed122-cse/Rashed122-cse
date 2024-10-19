import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter first number: ");
        int number1 = input.nextInt();
        System.out.print("now,enter second number: ");
        int number2 = input.nextInt();
        int sum = number1 + number2;
        System.out.println("sum of two numbers" + sum);
    }
}
