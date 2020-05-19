package introduction;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the number of elements in the array");
		int n=scanner.nextInt();
		int[] a=new int[n];
		for (int i=0;i<n;i++)
			a[i]=scanner.nextInt();
		boolean sorted;
		for(int i=0;i<n-1;i++)
		{
			sorted=true;
			for(int j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					sorted=false;
				}
			}
			if(sorted)
				break;
		}
     for(int item:a)
     {
    	 System.out.println(item);
     }
	}

}
