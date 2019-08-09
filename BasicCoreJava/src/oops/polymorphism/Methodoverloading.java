package oops.polymorphism;

public class Methodoverloading {

	public static void main(String[] args)
	{
		Methodoverloading obj=new Methodoverloading();
		obj.sum(10, 20);
		obj.sum(10, 20, 30);
	}

	
	public int sum(int a,int b)
	{
		return a+b;
		
	}
	public int sum(int a,int b,int c)
	{
		return a+b+c;
	}
	
}
