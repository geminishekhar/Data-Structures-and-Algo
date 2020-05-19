package operators;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int result;
		Scanner scanner =new Scanner(System.in);
		int n=scanner.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<n-2;i++)
		{
			
			result=a+b;
			a=b;
			b=result;
			System.out.println(result);
		}
		

	}

}
