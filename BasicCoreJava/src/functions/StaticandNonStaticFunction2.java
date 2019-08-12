package functions;

public class StaticandNonStaticFunction2 {

	public static String name="POOJA";
	public  String surname="HANDE";
	
	public static void fun1()
	{
		System.out.println(name);
		
		StaticandNonStaticFunction2 obj2= new StaticandNonStaticFunction2();
		System.out.println(obj2.surname);
	}
	public  void fun2()
	{
		System.out.println(name);
		System.out.println(surname);
	}
	public static void main(String[] args) {
		
		//static vriables and functions calling from secon class
		System.out.println(StaticandNonStaticFunction.name);
		StaticandNonStaticFunction.fun1();
		
		/*//non static variables  and functions calling from second class
		System.out.println(StaticandNonStaticFunction.surname);
		StaticandNonStaticFunction.fun2();*/
		
		//non static variables  and functions calling from second class
		StaticandNonStaticFunction obj =new StaticandNonStaticFunction();
		System.out.println(obj.surname);
		obj.fun2();
	}
	

}
