//Write a program to find factorial of a number. (Using Loop)

import java.util.Scanner;

public class Lab1_4 {
	public static void main ( String[] args ) {
		Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial = " + fact);
        
		sc.close();
	}
}
