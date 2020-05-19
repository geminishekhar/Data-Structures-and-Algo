package introduction;

public class PassByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog puppyDog=new Dog();
		puppyDog.legs=4;
		Change(puppyDog);
		System.out.println(puppyDog.legs);

	}
	static void Change(Dog dog)
	{
		dog.legs=6;
	}

}


class Dog
{
	int legs;
	}
