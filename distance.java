public class distance{
	public static void main(String args[])
{
	double x=Integer.parseInt(args[0]);
	double y=Integer.parseInt(args[1]);

double distance=Math.sqrt((x*x)+(y*y));
System.out.println("Distancebetween (x,y) = " + distance);

	}	
}