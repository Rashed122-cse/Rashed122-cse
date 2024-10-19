import java.util.Scanner;
class Bitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int bitwiseAND = num1 & num2;
        System.out.println("Bitwise AND: " + bitwiseAND);

        int bitwiseOR = num1 | num2;
        System.out.println("Bitwise OR: " + bitwiseOR);

        int bitwiseXOR = num1 ^ num2;
        System.out.println("Bitwise XOR: " + bitwiseXOR);

        int bitwiseNOT = ~num1;
        System.out.println("Bitwise NOT: " + bitwiseNOT);

        int leftShift = num1 << 2;
        System.out.println("Bitwise Left Shift: " + leftShift);

        int rightShift = num1 >> 2;
        System.out.println("Bitwise Right Shift: " + rightShift);

    }
}

