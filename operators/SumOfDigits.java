package operators;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=0;
		int n=12345;
//		while(n>0)
//		{
//			int rem=n%10;
//			result=result+rem;
//			n=n/10;
//			
//		}
		for(int i=n;i>0;i=i/10)
		{
			int temp=i%10;
			result=result+temp;
		}
		System.out.println(result);

	}

}
