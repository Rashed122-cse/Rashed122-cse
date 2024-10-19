import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number to table show: ");
        int num = input.nextInt();
        Table(num);
    }
    public static void Table( int num ){
        for (int i =1 ; i <= 10; i++){
            System.out.println(num+ "x" + i +"=" + (num*i));
        }
    }
}