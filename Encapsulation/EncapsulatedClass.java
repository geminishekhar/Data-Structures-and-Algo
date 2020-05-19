package Encapsulation;

public class EncapsulatedClass {
	
	private int roll;
	private String nameString;
	private int age;
	
	public void setAge(int age )
	{
		if(age>20)
		{
			System.out.println("you are too old.");
		}
		else {
			this.age=age;	
		}
		
	}
	public int getAge()
	{
		return age;
	} 

}
