import java.util.Scanner;

public class FibonacciSerise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter number : ");
        int number = sc.nextInt();
        printFibonacci( number);
    }
    public static void printFibonacci(int number ){
        int number1 = 0;
        int number2 = 1;
        if ( number == number1 ){
            System.out.print("0 ");
            return ;
        }
        if ( number == number2) {
            System.out.print("0 1");
            return;
        }
      while ( number1 < number ) {
        int number3 = number1 + number2 ;
        System.out.print( number1 +" ");
        number1 = number2;
        number2 = number3;
      }
    }
}

