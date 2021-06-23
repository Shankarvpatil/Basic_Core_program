import java.util.Scanner;
public class SwapNumber {
    static int temp;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = s.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = s.nextInt();
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping :");
        System.out.println("num1 =" + num1);
        System.out.println("num2 =" + num2);
    }
}
