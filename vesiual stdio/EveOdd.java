import java.util.Scanner;

public class EveOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number: ");
        int number = input.nextInt();
        if(number % 2 == 0){
            System.out.println("it is even number");
        }else{
            System.out.println("it is odd number");
        }
    }
}
