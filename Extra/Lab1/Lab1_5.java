//Write a program to find factorial of a number. (Using Recursion)

import java.util.Scanner;

public class Lab1_5 {
	public static void main ( String[] args ) {
		Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int fact = fact(num);
        System.out.println("Factorial = " + fact);

        sc.close();
    }

    public static int fact ( int num ) {
        if (num == 0) {
            return 1;
        } else {
            return num * fact(num - 1);
        }
    }
}
	
	