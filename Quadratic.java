import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a");
        double a=sc.nextInt();

        System.out.println("Enter b");
        double b=sc.nextInt();

        System.out.println("Enter c");
        double c=sc.nextInt();

        double delta = b*b-4*a*c;
        System.out.println("Delta = " + delta);

        double root1,root2;

        if(delta > 0)
        {
            root1=(-b + Math.sqrt(delta))/(2*a);
            root2=(-b - Math.sqrt(delta))/(2*a);

            System.out.println("root 1 = " + root1 + " and " + "root 2 = " + root2);

        }
        else if(delta == 0)
        {
            root1 = root2 = -b/(2*a);
            System.out.println(root1);
        }

        else {
            double realpart = -b/(2*a);
            double imaginarypart = Math.sqrt(-delta) / (2*a);

            System.out.println(realpart + " " + imaginarypart);
        }

    }
}
