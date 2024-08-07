package assignmentJava_coreJava;

abstract class Bank {

	abstract int getBalance();
}

class BankA extends Bank {
    private int balance;

    public BankA() {
        this.balance = 100;
    }

    @Override
    int getBalance() {
        return balance;
    }
}

class BankB extends Bank {
    private int balance;

    public BankB() {
        this.balance = 150;
    }

    @Override
    int getBalance() {
        return balance;
    }
}

class BankC extends Bank {
    private int balance;

    public BankC() {
        this.balance = 200;
    }

    @Override
    int getBalance() {
        return balance;
    }
}

public class Q_29 {
    public static void main(String[] args) {

    	Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();

        System.out.println("Balance in Bank A: $ " + bankA.getBalance());
        System.out.println("Balance in Bank B: $ " + bankB.getBalance());
        System.out.println("Balance in Bank C: $ " + bankC.getBalance());
    }
}