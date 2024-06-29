// Write a program to find whether a number is odd or even
import java.util.Scanner;

public class Lab1_2 {
	public static void main ( String[] args ) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		if (num % 2 == 0){
			System.out.println(num + " is an even number");
		}else{
			System.out.println(num + " is an odd number");
		}
		sc.close();
	}
}
