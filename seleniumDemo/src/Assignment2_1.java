

interface checkBal{
	 void checkBalance(int balance); 
			
}


interface deposite{
	 void DepositeBalance(int balance,int money);
}

interface withdraw{
	 void Withdraw(int balance, int money) throws InsufficientBalanceException;
}

interface customer{
	void customerDetail(String name, int accountNumber);
}

class  BankAccount implements  checkBal, withdraw,  deposite{
	 public void  checkBalance(int balance) {
		System.out.println(balance);
	}
	
	public void   Withdraw(int balance,int money) {
		if(balance<money) {
			System.out.println("you don't have enough money");
		
		}else {
			balance-=money;
			System.out.println("Successfully withdraw");
		}
		
	}

	
	
	public void  DepositeBalance(int balance,int money) {
		balance+=money;
		System.out.println(balance);
	}
	public void customerDetail(String name, int accountNumber) {
		System.out.println("Customer Nmae"+ name);
		System.out.println("Customer AccountNumber"+ accountNumber);
	}
	
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

public class Assignment2_1 {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		try {
			ba.Withdraw(500,600);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		ba.checkBalance(100);
		ba.DepositeBalance(0,500);
		
	}
}
