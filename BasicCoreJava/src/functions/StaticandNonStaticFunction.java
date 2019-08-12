package functions;

public class StaticandNonStaticFunction {

	public static String name="POOJA";
	public  String surname="HANDE";
	//static
	public static void fun1()
	{
		
	}
	public  void fun2()
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(name);
		
		StaticandNonStaticFunction obj=new StaticandNonStaticFunction();
		
		fun1();
		obj.fun2();
		System.out.println(obj.surname);
	}
	

}
