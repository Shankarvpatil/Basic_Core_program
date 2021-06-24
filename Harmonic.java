import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int arraySize = s.nextInt();
        int[] arr = arrayCreation(arraySize);
        int largestNum = findMax(arraySize, arr);
        System.out.println("Largest number is " + largestNum);
    }

    private static int[] arrayCreation(int arraySize){
        Scanner s = new Scanner(System.in);
        int[] number = new int[arraySize];
        for ( int i=0; i<arraySize; i++ ) {
            System.out.print("Enter value: ");
            number[i] = s.nextInt();
        }
        return number;
    }

    // 'findMax' function return a Largest values from an array.
    private static int findMax(int arraySize, int[] arrElements) {
        int largestNum = Integer.MIN_VALUE;
        for (int i=0; i<arraySize; i++) {
            if (largestNum < arrElements[i]) {
                largestNum = arrElements[i];
            }
        }
        return largestNum;
    }
}
