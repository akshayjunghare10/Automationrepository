package nterface;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		RBI bank;
		
		String bankname;
		bankname="SBI";
		if(bankname.equals("SBI"))
		{
			bank=new SBI();
			
			
		}
		
		else if(bankname.equals("IDBI"))
			{
			bank=new IDBI();
			}
		else if(bankname.equals("CITI"))
		{
			bank=new CITI();
		}
		bank=new SBI();
		bank.creditCard();
		bank.savingAccount();
		bank.currentAccount();
		bank.debitcard();

	}

}
