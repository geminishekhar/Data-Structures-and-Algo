package operators;

import java.util.Scanner;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the number of students in the class");
		int n=scanner.nextInt();
		int[] students=new int[n];
		for(int i=0;i<n;i++)
		{
			students[i]=scanner.nextInt();
		}
		int average=0;
		for(int i=0;i<n;i++)
		{
			average=average+students[i];
		}
		int result=average/n;
		System.out.println("average marks is " + result);
				

	}

}
