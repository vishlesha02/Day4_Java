import java.util.Scanner;

public class day4_p6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the divident");
        int divident =sc.nextInt();

        System.out.println("Enter the Divisor");
        int divisor = sc.nextInt();

        int q=divident / divisor;
        int r=divident % divisor;

        System.out.println("The Quotient = " + q);
        System.out.println("The Reminder = " + r);
    }

}
