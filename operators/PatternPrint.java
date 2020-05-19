package operators;

public class PatternPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int i=1;i<=10;i++)
		{
			if(i==1 || i==n)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
			}
			else 
			{
				System.out.print("*");
				for(int j=1;j<=i-2;j++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
			}
			
			System.out.println();
			
		}

	}

}
