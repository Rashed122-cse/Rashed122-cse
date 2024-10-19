import java.util.Scanner;

public class Reversedigite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int number = sc.nextInt();
       int reverse = reverse(number);
        System.out.println(" new number : " + reverse);

    }
    public static int reverse(int number){
        int rev  = 0;
        while (number > 0){
            int reminder = number % 10 ;
            rev = (rev * 10) + reminder;
            number /= 10 ;
        }
        return rev;
    }
}
