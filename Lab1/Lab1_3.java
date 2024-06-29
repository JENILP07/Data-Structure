//Write a program to determine whether the entered character is vowel or not.
import java.util.Scanner;

public class Lab1_3 {
	public static void main ( String[] args ) {
		Scanner sc = new Scanner (System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " is a vowel");
        }else{
            System.out.println(ch + " is a consonant");
        }
		sc.close();
	}
}
