import java.sql.SQLOutput;
import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your name");
       String name=  input.nextLine();
        System.out.println("good morning" + name);
        System.out.print(name+",also tell me your age");
        int age = input.nextInt();
        System.out.println("your age is "+age);
    }
}
