package functions;

public class Car {
	
	int wheels=4;
	String colour="White";
	String model="VDI";
	
	public void braking()
	{
	System.out.println(colour+" "+model+"car is having" + wheels+"wheels");
	}

	//default constructor
	public Car()
	{
		
	}
	//parameterized constructor
	public Car(String colour1,String model1)
	{
		
		colour=colour1;
		model=model1;
	}
	
}
