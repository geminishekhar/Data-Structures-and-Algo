package userInput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String hello=sc.nextLine();
//		System.out.println(hello);
		Scanner scanner =new Scanner(System.in);
		double principal=scanner.nextDouble();
		float time=scanner.nextFloat();
		float rate=scanner.nextFloat();
		double interst=(principal*rate*time)/100;
		System.out.println("The interest of the amount over these years at this interest is  "+ interst);

	}

}
