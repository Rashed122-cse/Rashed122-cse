import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner Number = new Scanner(System.in) ;
        System.out.println("Finding the biggest number: ");
        System.out.print("value of number 1: ");
        double A = Number.nextDouble();
        System.out.print("value of number 2: ");
        double B = Number.nextDouble();
        System.out.print("value of number 3: ");
        double C = Number.nextDouble();

        if (A>B && A>C){
            System.out.println("bigger is number 1: " +A);
        }
        else{
            if(B>C && B>A){
                System.out.println("bigger is number 2: " +B);
            }
            else{
                System.out.println("bigger is number 3: " +C);
            }
        }

    }
}
