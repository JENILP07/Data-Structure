//Area of Circle
import java.util.Scanner;
public class Lab1_1 {
	public static void main ( String[] args ) {
		Scanner sc = new Scanner (System.in);
		System.out.print ("Enter Radius : ");
		double radius = sc.nextInt ();
		double area = 3.14 * radius * radius;
		System.out.println ("Area = " + area);
		sc.close();
	}
}
