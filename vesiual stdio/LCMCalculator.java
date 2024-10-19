import java.util.Scanner;

public class LCMCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int LCM =  calculateLCM(number1, number2);
        System.out.println("LCM of " + number1 + " and " + number2 + " is: " +LCM);
        sc.close();
    }

    public static int calculateLCM(int number1, int number2) {
        for (int i = 1; i <= number1; i++) {
            int LCM = number1 * i;
            if (LCM % number2 == 0) {
                return LCM;
            }
        }
        return 0;
    }
}
