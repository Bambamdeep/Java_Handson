package singleton;

public class Fan {
	
	private static  Fan instance ;
	private Fan () {
		System.out.println("FAN INSTANCE IS CREATED ");
	}
	public static Fan fanInstance() {
		if (instance == null) {
			instance = new Fan();
		}
		return instance ;
	}
	
	public static void main (String [] args) {
		Fan fan1 = Fan.fanInstance();
	}
	

}
