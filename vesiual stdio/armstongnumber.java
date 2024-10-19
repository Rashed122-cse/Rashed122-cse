import java.util.Scanner;
 public class armstongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter number : ");
        int number = sc.nextInt();
        int sum = armstong( number);
        cheak ( number , sum) ; 
        
    }
       
     static void cheak(int num , int sum ) {
        if ( sum == num ){
            System.out.println( num + " is a armstong number");
        }else{
            System.out.println(num + " is not a armstong number ");
        }
    }
    

     static int armstong ( int number){
        int sum = 0;
        while ( number != 0){
            int reminder = number % 10 ;
            sum += Math.pow(reminder,3);
            number /= 10 ;
        }
        return sum;
    }
}