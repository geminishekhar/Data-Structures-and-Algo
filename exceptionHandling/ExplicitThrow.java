package exceptionHandling;

public class ExplicitThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		boolean isDanger=true;
//		if(isDanger)
//		{
//			throw new ArithmeticException("Danger,don't go ahead");
//		}
		fn1();

	}
	
	static void fn1()
	{
		int a=5;
		int b=3;
		int c=a/b;
		System.out.println("c");
		try {
		fn2();
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage() +"its danger to go there");
		}
	}
    
	
	static void fn2() throws ArithmeticException
	{
		boolean isDanger=true;
		if(isDanger)
		{
			throw new ArithmeticException("Danger,don't go ahead");
		}	
	}
}
