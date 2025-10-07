package interfaceDemo;
interface A {
          
	void methodA() ;
	void show();
	
}
interface B extends A{
	void methodB();
	void show();
}


class C implements B{

	@Override
	public void methodB() {
		System.out.println("Method B is calling");
		
	}

	@Override
	public void methodA() {
		System.out.println("Method A is calling ");
		
	}

	@Override
	public void show() {
	System.out.println("common method is called " );// slove this we need to pass the Interface name like this (A.super.show());
		
	}
	
}