package operators;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=0;
		int n=12321;
		while(n>0)
		{
			int temp=n%10;
			result=(result*10)+temp;
			n=n/10;
		}
    System.out.println(result);
	}

}
