package singleton;

public class Sinleton {
	private Sinleton()
	{
		
	}
     
	
	private static Sinleton objectSinleton=new Sinleton();
	public static Sinleton getinstance()
	{
		return objectSinleton;
	}
}
