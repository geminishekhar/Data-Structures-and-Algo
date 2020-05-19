package operators;

public class MaxOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=4;
		int c=2;
		if(a>b)
		{
			if(a>c)
				System.out.println("A is the largest number");
			else {
				System.out.println("C is largest number ");
			}
		}
		else if(b>c)
		{
			System.out.println("B is the largest number ");
		}
		else {
			System.out.println("C is the largest number ");
		}

	}

}
