package functions;

public class User {

	public static void main(String[] args) {
		

		Car maruti=new Car();
		
		maruti.model="BMW-AX07";
		maruti.colour="Gray";
		//maruti.model="Swift";
		maruti.wheels=4;
		maruti.braking();
		
		
		
		
		Car tata=new Car();
		tata.colour="red";
		tata.model="polo";
		tata.braking();
		
		Car VW=new Car();
		VW.colour="Gray";
		VW.model="nano";
		VW.wheels=4;
        VW.braking();

	}

}
