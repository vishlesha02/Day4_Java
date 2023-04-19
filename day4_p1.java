import java.util.Scanner;
public class day4_p1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number ");
        int flip= sc.nextInt();
double count1=0,count2=0;
        for(int i=0;i<flip;i++) {

            double randomnum = Math.random();
            //System.out.println(randomnum);

            if (randomnum < 0.5) {
                System.out.println("tails");
                count1 = count1 + 1;
            } else {
                System.out.println("Heads");
                count2 = count2 + 1;


            }
        }
        double win1=(count1/flip)*100;
        double win2=(count2/flip)*100;

        System.out.println("Tails : " + win1);
        System.out.println("Heads : " + win2);

    }
}