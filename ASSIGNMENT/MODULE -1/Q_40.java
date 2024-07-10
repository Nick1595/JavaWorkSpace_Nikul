package assignmentJava_coreJava;

class insufficientBalance extends Exception
{
	int requiredAmount = 0;
	
	public insufficientBalance(int requiredAmount)
	{
		this.requiredAmount = requiredAmount;
	}
	public int getRequiredAmount()
	{
		return requiredAmount;
	}
	
	public String getMessage()
	{
		return "Sorry, insufficient balance. You need more " + requiredAmount + "Rs. to perform this transaction." ;
	}
}


class BankAccount {
 private int accountBalance;

 public BankAccount(int initialBalance) {
     this.accountBalance = initialBalance;
 }

 
 public void withdraw(int amount) throws insufficientBalance{
     if (amount > accountBalance) {
         throw new insufficientBalance(amount - accountBalance);
     } else {
         accountBalance -= amount;
         System.out.println("Amount withdrawn successfully. Remaining balance: " + accountBalance);
     }
  }
}

public class Q_40 {
   public static void main(String[] args) {	
	   
	   BankAccount account = new BankAccount(2000);	   
	   
	   try 
	   {
		int withdrawAmount = 2500;
		account.withdraw(withdrawAmount);
	   } 
	   catch (insufficientBalance e) 
	   {
		// TODO: handle exception
		System.out.println(e.getMessage());
	   }
   }
}