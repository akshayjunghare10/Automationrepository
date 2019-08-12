package vairiablesanddatatypes;

//import 
import functions.accessmodifier;

public class testaccessmodwithinpackage extends accessmodifier
{

	public static void main(String[] args) 
	{
		
   System.out.println("testaccessmodwithinpackage");
   accessmodifier obj=new accessmodifier();
   obj.publicfunction();
   
   
   testaccessmodwithinpackage obj2=new testaccessmodwithinpackage();
   obj2.protectedfunction();
   
   
   
	}

	}


