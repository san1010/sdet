package javaActivity1;

public class Activity1 {

	public static void main(String[] args) {
		Car myCar=new Car();
		myCar.displayCharacteristics();
		myCar.accelerate();
		myCar.brake();
		
		System.out.println("============");
		// TODO Auto-generated method stub
		myCar.color="Black";
		myCar.make=2015;
		myCar.transmission="Manual";
		
		myCar.displayCharacteristics();
		myCar.accelerate();
		myCar.brake();
	}

}
