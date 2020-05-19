package introduction;

public class MyConsructors {

	public static void main(String[] args) {
		Vehicle car=new Vehicle(4, 2);
       System.out.println(car.wheels);
	}

}


class Vehicle
{
	int wheels;
	int headlights;
	int colours;
	 Vehicle(int wh,int headl) {
		wheels=wh;
		headlights=headl;
	}
	 Vehicle(int headl) {
//			wheels=wh;
			headlights=headl;
		}
	}
