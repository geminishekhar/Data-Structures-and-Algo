package operators;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		int n=scanner.nextInt();
		float result=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			result=result-(1/(float)i);
			else {
				result=result+(1/(float)i);
			}
		}
	    System.out.println(result);

	}

}
