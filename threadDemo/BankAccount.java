package threadDemo;

public class BankAccount {
	private int balance = 1000;
	public void withdraw (int amount) {
		synchronized(this) {
			if (balance >= amount) {
				balance -= amount;
				System.out.println("withdraw: " + amount + "Remaining:"+ balance);
			}else {
				System.out.println("Insufficient fund");
			}
		}
	}
	

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount(); 
		Thread t = new Thread(() -> bankAccount.withdraw(500));
		Thread t1 = new Thread(() -> bankAccount.withdraw(600));
		t.start();
		t1.start();

	}

}
