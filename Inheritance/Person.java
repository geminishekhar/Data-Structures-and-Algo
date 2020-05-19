package Inheritance;

public class Person {
	String name;
	public Person(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
		System.out.println("Person contructor");
	}
	
	
	public void eat()
	{
		System.out.println("person is eating");
	}
	public void sleep()
	{
		System.out.println("person is sleeping");
	}

}
