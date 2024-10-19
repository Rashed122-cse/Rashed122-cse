import java.util.Scanner;

public class AreaTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("traingle width: ");
        double W = sc.nextDouble();
        System.out.print("traingle hight: ");
        double H = sc.nextDouble();
        System.out.println("area of traingle :"+(W*H)/2); //direct calculation from PRINT
    }
}
