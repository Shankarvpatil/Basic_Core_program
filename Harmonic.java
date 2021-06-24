import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = s.nextInt();
        //boolean prime = isPrime(number);
        //System.out.println(prime);
        primeFactors(number);
    }
    private static boolean isPrime(int number) {
        int i = 2;
        //boolean flag = true;
        int count = 0;
        if (number == 1 || number == 0) {
            return false;
        } else {
            while(i < (number/2)) {
                if (number%i == 0) {
                    count++;
                }
                i++;
            }
            if (count == 1)
                return false;
            return true;
        }
    }

    private static void primeFactors(int primeFactors) {
        int i = 2;
        while (primeFactors > 1) {
            if (primeFactors%i == 0 && isPrime(i) == true) {
                System.out.println(i);
                primeFactors = primeFactors / i;
            }
            i++;
        }
    }
}
