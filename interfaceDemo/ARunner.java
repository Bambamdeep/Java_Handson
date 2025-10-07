package interfaceDemo;

public class ARunner {

	public static void main(String[] args) {

	  B a = new C();
	  a.methodA();
	  a.methodB(); // Beacuse Refering  it in interface A but methodB is present in interface B we can not call parent with child class;
	  
	  B b = new C();
	  b.methodB(); //
	  
	  b.show();
	  

	}

}
