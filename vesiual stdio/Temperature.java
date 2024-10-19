import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter fahrenheit temperature: ");
        float fahrenheit = input.nextFloat();
        float celsius = (fahrenheit - 32) * 5/9;
        System.out.println("celsius temperature: " + celsius);
    }
}
