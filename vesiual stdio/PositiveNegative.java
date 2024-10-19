import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number: ");
        int number = input.nextInt();
        if(number > 0){
            System.out.println(number + " is positive number");
        }
        else if(number == 0){
                System.out.println(number + " is zero number");
            }
            else{
                System.out.println(number +" is negative number");
            }
        }
    }
