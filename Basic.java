import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Check whether a number is odd or even.");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        if (num%2 == 0) {
            System.out.println(num + " is even number.");
        } else {
            System.out.println(num + " is odd number.");
        }
    }
}
