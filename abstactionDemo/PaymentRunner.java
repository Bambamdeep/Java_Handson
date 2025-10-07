package abstactionDemo;

public class PaymentRunner {

	public static void main(String[] args) {
		BankTransfer bankTransfer = new BankTransfer("Deepak Kumar",10000,"SBI");
		
		bankTransfer.makePayment();
		bankTransfer.Receipt();

	}

}
