import java.util.Scanner;

public class BOOLEAN {
    public static void main(String[] args) {

        Scanner GENDER = new Scanner(System.in);

        boolean people = true;

        System.out.print(" first person name is: ");
        String  Male= GENDER.nextLine();

        System.out.print(" second person name is: ");
        String Female = GENDER.nextLine();

        if(people){
            System.out.println(Male+" is male");
        }
        else{
            System.out.println(Female+" is female");
        }
    }
}
