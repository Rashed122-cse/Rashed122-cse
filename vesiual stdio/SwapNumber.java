import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("value of A: ");
        int A = input.nextInt();

        System.out.print("value of B: ");
        int B = input.nextInt();

        int C = A;
        A=B;
        B=C;
        System.out.println("after Sawping A: "+A);
        System.out.println("after Swapiung B: "+B);

     }
}
