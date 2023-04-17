import java.util.Scanner;

public class day4_p7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Num 1");
        int num1=sc.nextInt();

        System.out.println("Enter Num 2");
        int num2=sc.nextInt();

        int temp;

        temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("After Swapping : ");
        System.out.println("Num 1 = " + num1);
        System.out.println("Num 2 = " + num2);
    }
}
