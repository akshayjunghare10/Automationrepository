package oopsinheritance;

import oops.polymorphism.Methodoverloading;

public class akshay 
{

	public static void main(String[] args)
	{
		
		telephone  phone=new telephone();
		phone.calling();
		
		mobile m=new mobile();
		m.texting();
		m.calling();
		
		
		
		smartphone sm=new smartphone();
		sm.internet();
		sm.calling();
		sm.texting();
		
		
		telephone p;
		
		p=new telephone();
		p.calling();
		p=new mobile();
		p.calling();
		
		p=new smartphone();
		p.calling();
		
	}

}
