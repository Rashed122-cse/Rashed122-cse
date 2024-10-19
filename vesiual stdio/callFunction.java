import java.util.Scanner;

public class callFunction {
    public static void main(String[] args) {
        int sum = number() + number() ;
        System.out.println("sum : "+sum);
    }
    public static int number(){
        Scanner input = new Scanner(System.in);
        int numberRead = input.nextInt();
        return numberRead;
    }
}
