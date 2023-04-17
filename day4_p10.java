import java.util.Scanner;

public class day4_p10 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Num 1");
        int num1=sc.nextInt();
        System.out.println("Enter Num 2");
        int num2=sc.nextInt();
        System.out.println("Enter Num 3");
        int num3=sc.nextInt();

        if((num1 > num2) && (num1 > num3)) {
            System.out.println("Num 1 is Largest Number = " + num1);
        }

        else if((num2 > num1) && (num2 > num3)){
            System.out.println("Num 2 is Largest Number = " + num2);
        }

        else if((num3 > num1) && (num3 > num2))
        {
            System.out.println("Num 3 is Largest Number = " + num3);
        }

    }
}
