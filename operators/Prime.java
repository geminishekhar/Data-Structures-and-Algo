package operators;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=scanner.nextInt();
		boolean isPrime=true;
		for(int i=2; i * i <= n ;i++)
		{
			if( n % i == 0)
			{
				isPrime=false;
			break;
			}
		}
		if(n<2)
			isPrime=false;
        System.out.println("isPrime: " + isPrime);
	}

}
