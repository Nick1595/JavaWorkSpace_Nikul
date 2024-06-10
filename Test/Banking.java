package Test;



	
	class BankAccount {
	    protected double balance;

	    public BankAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited " + amount + " successfully.");
	    }

	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println("Withdrawn " + amount + " successfully.");
	        } else {
	            System.out.println("Insufficient funds.");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }
	}

	class SavingsAccount extends BankAccount {
	    public SavingsAccount(double initialBalance) {
	        super(initialBalance);
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (balance - amount >= 100) {
	            balance -= amount;
	            System.out.println("Withdrawn " + amount + " successfully.");
	        } else {
	            System.out.println("Withdrawal failed: Balance must remain above 100.");
	        }
	    }
	}

	public class Banking  {
	    public static void main(String[] args) {
	        SavingsAccount savingsAccount = new SavingsAccount(500);
	        System.out.println("Initial balance: " + savingsAccount.getBalance());
	        
	        savingsAccount.withdraw(50); // Allowed
	        System.out.println("Current balance: " + savingsAccount.getBalance());
	        
	        savingsAccount.withdraw(500); // Not allowed
	        System.out.println("Current balance: " + savingsAccount.getBalance());
	    }
	}


