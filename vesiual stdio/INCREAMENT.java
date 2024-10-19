import java.util.Scanner;

public class INCREAMENT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int P = input.nextInt();
        System.out.println(P++); //increment and decrement are same
        System.out.println(P);
        System.out.println(++P);

        int R = input.nextInt();
        System.out.println(R);
        R++;
        System.out.println(R);
        ++R;
        System.out.println(R);


    }
}
