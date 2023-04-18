import java.util.Scanner;

public class day4_p4 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num=sc.nextInt();

        double result=0.0;

        System.out.print("Harmonic of given Number is : ");
        for(int i=num;i > 0 ;i--)
        {
            result=result + (double)1/i;
            System.out.print(result + " , ");
        }
    }
}
