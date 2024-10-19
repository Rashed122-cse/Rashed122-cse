import java.util.Scanner;

public class factorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" enter factorial number : ");
        int num = input.nextInt();
         int calculation = 1 ;
        for (int i = 1 ; i <= num ; i++){
            calculation  = calculation * i ;
        }
        System.out.println("Calculation of factorial number is : " +calculation);
    }
}
