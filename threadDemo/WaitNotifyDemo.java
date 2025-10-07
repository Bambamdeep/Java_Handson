package threadDemo;

public class WaitNotifyDemo {
	int data;
	boolean hasData = false;

	public synchronized void produce(int value) {
		while (hasData) {
			try {
				wait();
				System.out.println("wait for consumer to consume");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Data has produced");
		data = value;
		
		hasData = true;
		notify();
	}

	public synchronized void consume() {
		while (!hasData) {
			System.out.println("wait for producer to produce");
			try {
				wait();
			} catch (Exception e) {

				e.printStackTrace();
			}

		}
		System.out.println("Data has Consumed " + data);
		hasData = false ;
		notify();

	}

}
