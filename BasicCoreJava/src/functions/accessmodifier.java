package functions;

public class accessmodifier
{
	public static void main(String[] args)
	{
		
		accessmodifier obj=new accessmodifier();
		obj.publicfunction();
		
		//testaccessmodwithinpackage obj2=new testaccessmodwithinpackage();
		obj.privatefunction();
		obj.defaultfunction();
		obj.protectedfunction();
	} 
	
	
	
	
public void publicfunction()

	{
     System.out.println("public function");

	}
	


private void privatefunction()
{
     System.out.println("private function");

	}
	



protected void protectedfunction()
{
	{
     System.out.println("protected function");

	}
	
}

 void defaultfunction()
	{
     System.out.println("default function");

	}
	



}
