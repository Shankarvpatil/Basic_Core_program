import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int p = 1;

        if (N > 0 && N < 31) {
            for (int i = 1; i <= N; i++) {
                p = p * 2;
                System.out.println(2 + " to the power " + i + " : " + p);
            }
        } 
        else {
            System.out.println("Overflow");
        }
    }
}
