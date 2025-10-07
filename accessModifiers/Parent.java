package accessModifiers;

 class Parent {
	 
	 Parent(){
		 display();
	 }
	 void display() {
		 System.out.println("super constructor");	 }

}
 class Child extends Parent{
	 int x = 10;
	 void dispaly() {
		 System.out.println("Child x is called " + x);
		 
	 }
 }
 
