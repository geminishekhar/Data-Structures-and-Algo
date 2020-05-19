package operators;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the number");
		int a=scanner.nextInt();
		int factorial=1;
		for (int i=a ; a>0 ; a--)
		{
			factorial=factorial*a;
		}
		System.out.println("The factorial of the number is " + factorial) ;

	}

}
