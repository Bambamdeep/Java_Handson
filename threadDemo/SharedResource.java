package threadDemo;

public class SharedResource {
	int number = 0;

	public synchronized void increment() {
		number++;
		System.out.println("increase" + number);

	}

	public synchronized void decrease() {
		number--;
		System.out.println("increase" + number);

	}

	public static void main(String[] args) {

		SharedResource sharedResource = new SharedResource();

		Thread t1 = new Thread(()-> sharedResource.increment());
		Thread t2 = new Thread(() -> sharedResource.decrease());
		
	    t1.start();
		t2.start();

	}
}
