import java.util.Scanner;
public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a dividend: ");
        int dividend = s.nextInt();
        System.out.print("Enter a divisor: ");
        int divisor = s.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

    }
}
