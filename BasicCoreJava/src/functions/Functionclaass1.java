package functions;

public class Functionclaass1 {
 int a=10;
	public static void main(String[] args) {
		
		/*
		 * myFirstFunction(); sum(); sum(10,50); sum(70,90);
		 */
		
		int add=sum2(5,10);
		System.out.println(add);
	}
	
	//1.function with no return type and no arguments
	public static void myFirstFunction()
	{
		System.out.println("testing");
	}
	
	//2.funtion with no return type and no arguments and two arguments.
	public static void sum()
	{
		
		int a=10;
		int b=30;
		System.out.println(a+b);
	}
	public static void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public static int sum2(int a,int b)
	{
		return a+b;
	
	}
	}

