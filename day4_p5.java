
import java.util.Scanner;
public class day4_p5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
                int n = sc.nextInt();
                int count=0;

                for(int i=2;i<n+1;i++) {
                    while (n % i == 0) {
                        n = n / i;
                        count++;
                        System.out.println(i);
                        break;

                    }
                    if(n ==1 || n==2) {
                        break;
                    }

                    }

            }}




