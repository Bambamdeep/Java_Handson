package abstactionDemo;

abstract class Payment {
 String payerName;
 double amount;
 // we can create constructor in abstract class but we can not create in Interface.
 Payment (String payerName,double amount ){
	 this.payerName = payerName;
	 this.amount= amount;
 }
 //Abstract Method
  abstract void makePayment() ;
  
  // Regular method
	public void Receipt() {
		System.out.println("PayerName :" + payerName + " \nAmount " + amount);
	}
	
	
}

// Abstract class need to be extends because we can not create object of this class .
class BankTransfer extends Payment{
   String bankName;
	BankTransfer(String payerName, double amount,String bankName) {
		super(payerName, amount);
		this.bankName = bankName;
	}

	@Override
	void makePayment() {
	System.out.println("Payment has been sucessful: " + "\nBankName: " + bankName + "\nAmount : " + amount);
		
	}
	// it is override the regular method in abrtact class method 
	public void Receipt() {
		System.out.println("PayerName :" + payerName + " \nAmount " + amount + "\nbankName: " + bankName);
	}
}