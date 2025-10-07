package accessModifiers;

public class Math {
  
	public int add (int a,int b) {
		return a+b;
	}
	public int add(int a , int b , int c) {
		return a+b+c;
	}
	public double add (int a ,int b,int c,int d) {
		return a+b+c+d;
	}
	public double add(int a) {
		return a+0;
	}
	
	public static int multiply(int i ,int j) {
		return i*j;
	}
	public void display(int w,int x,int y,int z) {
		System.out.println(add(w,x));
		System.out.println(add(w,x,y));
		System.out.println(add(w,x,y,z));
		System.out.println(add(w));
		
	}
	
}
