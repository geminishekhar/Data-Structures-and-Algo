package Inheritance;

public class Teacher extends Person {
	
	public Teacher(String name) {
		// TODO Auto-generated constructor stub
		super(name);
		this.name=name;
		System.out.println("Teacher constructor");
	}
	
	public void teach()
	{
		System.out.println("Teacher isi teaching");
	}
    public void eat()
    {
    	super.eat();
    	System.out.println("Teacher is eating");
    }
}
