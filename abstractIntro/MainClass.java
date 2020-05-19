package abstractIntro;

public class MainClass {
	
	
	public static  void repair(Car car)
	{
		System.out.println("Car is repairing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wagonR wagonR1=new wagonR();
		Audi audi1 =new Audi();
		
		repair(wagonR1);
		repair(audi1);

	}

}
