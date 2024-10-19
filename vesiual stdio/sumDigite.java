import java.util.Scanner;

public class sumDigite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" enter number : ");
        int num = input.nextInt();
        sum (num);
    }

    public static void sum(int num) {
        int Suumm = 0 ;
        while (num > 0 ){
            Suumm += num % 10 ;
            num /= 10;
        }
        System.out.println("summation of digite is : " +Suumm);
    }
}
