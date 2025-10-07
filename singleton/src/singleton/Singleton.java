package singleton;

public class Singleton {
private static Singleton instance;

private Singleton() {
	System.out.println("Singleton instance is created");
}
public static Singleton singletonInstance() {
	if (instance == null) {
		instance = new Singleton();
	}
	return instance;
}

public static void main (String [] args) {
	Singleton s1 = Singleton.singletonInstance();
}


}
