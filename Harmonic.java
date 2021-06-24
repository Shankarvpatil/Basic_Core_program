import java.util.Scanner;
public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = s.nextInt();
        double harmonicNum = 0;

        if (num>0) {
            for (int i=1; i<=num; i++) {
                harmonicNum = harmonicNum + (1.0/i);
            }
            System.out.printf("Harmonic number is: %.4f ", harmonicNum);
        } else {
            System.out.println("Number should be greater than 0.");
        }
    }
}
