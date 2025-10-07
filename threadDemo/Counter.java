package threadDemo;

public class Counter {
	int count = 0;

	public synchronized void increment() {
		count++;
	}

	public static void main(String[] args) throws Exception {
		Counter counter = new Counter();
		Thread thread = new Thread(() -> {
			for (int i = 0; i < 100; i++) {
				counter.increment();
			}
		});
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 50; i++) {
				counter.increment();
			}
		});
		thread.start();
		thread1.start();
		thread.join();
		thread1.join();
		System.out.println("count " + counter.count)	;

}
}