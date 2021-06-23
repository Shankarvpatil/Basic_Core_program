import java.util.Scanner;
public class FlipCoin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many times u want to toss a coin: ");
        int coinToss = s.nextInt();
        if (coinToss > 0) {
            int i = 1;
            int headCount = 0;
            int tailCount = 0;
            while (i <= coinToss) {
                double random = Math.random();
                if (random < 0.5) {
                    //System.out.println("Tail");
                } else {
                    //System.out.println("Head");
                    headCount++;
                }
                i++;
            }
            System.out.println("Head count = " + headCount);
            tailCount = coinToss - headCount;
            System.out.println("Tail count = " + tailCount);
            double headPercentage = (headCount*100.0)/coinToss;
            System.out.printf("Head percentage = %.2f %n", headPercentage);
            double tailPercentage = 100 - headPercentage;
            System.out.printf("Tail percentage = %.2f %n ", tailPercentage);

        } else {
            System.out.println("Enter positive number.");
        }
    }
}
