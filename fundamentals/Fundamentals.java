package fundamentals;

public class Fundamentals {

	public static void main(String[] args) {
   // Data Types and Variables;
		int age = 1;
		float marks = 78.3f;
		double average = 23.33;
		char section = 'A';
		boolean isPass = true;
		byte Mybyte = 100;
		short myShort = 2000;
		long myLong = 1233456789L;
		System.out.println(age);
		System.out.println(marks);
		System.out.println(average);
		System.out.println(section);
		System.out.println(isPass);
		System.out.println(Mybyte);
		System.out.println(myShort);
		System.out.println(myLong);
		System.out.println(Mybyte+"\n");
		
		// Typecasting
		System.out.println("TypeCasting\n");
		   int number = 100;
		   //Implicit casting
		   double marks1 = number; 
		   // explicit Casting 
		   double average1 = (int) 65.23; 
		   int average2 = (int)  68.29;
		   System.out.println(marks1);
		   System.out.println(average1);
		   System.out.println(average2);
            System.out.println("Operation\n");
            // Operation;
            int x = 10 ;
            int y = 4;
            System.out.println(x+y);
            System.out.println(x-y);
            System.out.println(x*y);
            System.out.println(x/y);
            System.out.println(x%y);
            //Unary
            System.out.println(x++);
            System.out.println(++x);
            System.out.println(x--);
            System.out.println(--x);
            
            System.out.println("Relation\n");
            //Relational 
            System.out.println(x>y);
            System.out.println(x<y);
            System.out.println(x>=y);
            System.out.println(x!=y);
            System.out.println(x==y);
            
	}

}
