import java.util.Scanner;

public class functionPattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        patternFor1(row);
        patternWhile1(row);
        patternfor2(row);
        patternWhile2(row);
    }
    public static void patternFor1(int row){
        for (int i = 1 ; i <= row ; i++){
            for (int j = row ; j > i; j--){
                System.out.print(" ");
            }
            for ( int k = 1 ; k <= i ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void patternWhile1( int row){
        int i = 1;
        while (i <= row){
            int j = row;
            while (j > i){
                System.out.print(" ");
                j--;
            }
            int k = 1;
            while (k <= i){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
    }
    public static void patternfor2(int row){
        for (int i = 1 ; i <= row ; i++){
            for (int j = 1 ; j < i ; j++){
                System.out.print(" ");
            }
            for (int k = row ; k >= i ; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void patternWhile2(int row){
        int i = 1;
        while (i <= row){
            int j =1;
            while (j < i){
                System.out.print(" ");
                j++;
            }
            int k = row ;
            while (k >= i){
                System.out.print("*");
                k--;
            }
            System.out.println();
            i++;
        }

    }
}
