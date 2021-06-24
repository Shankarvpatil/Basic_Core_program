import java.util.Scanner;

public class VovelConsonant {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char alphabet = s.next().charAt(0);
        switch (alphabet) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(alphabet + " is vovel");
                break;
            default:
                System.out.println(alphabet + " is consonant");
        }

    }
}
