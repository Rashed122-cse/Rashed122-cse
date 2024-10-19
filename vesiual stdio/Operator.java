import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        Scanner input = new Scanner(System.in);
        double x=input.nextDouble()  ;
        double y=input.nextDouble();
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);

        System.out.println(x+y*x/y);
        System.out.println(x+y*(x/y));

        int z=8;
        int R = input.nextInt();
        z=z+R;
        System.out.println(z);
        z+=R;
        System.out.println(z);
        z++;
        System.out.println(z);
        ++z;
        System.out.println(z);

    }
}
