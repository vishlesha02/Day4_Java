import java.util.Scanner;

public class day4_p9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Alphabet");
        String letter = sc.next();
        switch (letter)
        {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(letter + " is a vowel");
            break;

            default:
                System.out.println(letter + " is a consonant");

        }
    }
}
