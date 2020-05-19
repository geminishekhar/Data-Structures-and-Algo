package operators;

import java.util.Scanner;

//import com.su

public class PowerCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=scanner.nextInt();
		System.out.println("Enter the Second number");
		int b=scanner.nextInt();
		int result=1;
		for(int i=0;i<b;i++)
		{
			result=result*a;
		}
		System.out.println(a+" Power raised to " + b +" is " + result);

	}

}
