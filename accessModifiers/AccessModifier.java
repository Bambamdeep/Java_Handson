package accessModifiers;

public class AccessModifier {
	
	private int a =10;
	public int b = 20;
	protected int c = 30;
	int d = 40;
	
	public void show () {
		System.out.println("private :" + a);
		System.out.println("public :" + b);
		System.out.println("protected :" + c);
		System.out.println("defalut :" + d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier accessModifier = new AccessModifier();
		accessModifier.show();
		accessModifier.a =20;
		accessModifier.show();
		
		
	}


}