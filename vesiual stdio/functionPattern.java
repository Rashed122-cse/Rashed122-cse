import java.util.Scanner;

class fanctionPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows for the triangle: ");
        int row = input.nextInt();

        patternFor1(row);
        patternWhile1(row);

        patternFor2(row);
        patternwhile2(row);

        input.close();
    }
    public static void patternFor1(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void patternWhile1(int n2) {
        int currentRow = 0;
        while (currentRow < n2) {
            int i = 0;
            while (i <= currentRow) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            currentRow++;
        }
    }
    public static  void patternFor2(int x1){
        for (int i = x1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void patternwhile2 ( int x2){
        while (x2 >=1){
            int i = 1;
            while(i <=x2){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            x2--;
        }
    }
}
