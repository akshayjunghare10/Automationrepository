package functions;

public class FunctionClass2 {

	public static void main(String[] args) {
		
		String str=Name("POOJA","HANDE");
		System.out.println(str);
				
		Boolean BL= Eligibal(40);
		if(BL)
		{
			System.out.println("You are eligibal");
		}
		else
		{
			System.out.println("You are not eligibal");
		}

	}
	
	public static String Name(String  Name,String surname)
	{
	
		return "your name is" +Name+" "+surname;
	}

	public static Boolean Eligibal(int age)
	{
     
		if(age>=18 && age<=30)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
