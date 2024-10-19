import java.util.Scanner;

public class Plaindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter number ");
        int number = sc.nextInt();
        int inputnumber = number ;
        int newnum = cheak(number);
        if ( inputnumber == newnum){
            System.out.println(inputnumber + " it is plaindrome number ");
        }else{
            System.out.println(inputnumber + "it is not plaindrome ");
        }
    }
    public  static int cheak( int number ){
        int newnum = 0 ;
        while (number != 0) {
           int reminder = number % 10 ;
           newnum = reminder + newnum * 10 ;
            number /= 10 ;
        }
        return newnum ;
    }
}
