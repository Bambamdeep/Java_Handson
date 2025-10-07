package threadDemo;

public class OddEven {

	boolean isEven = true;

	public synchronized void even(int number) {
		while (isEven) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Even:- " + number);
		isEven = true;
		notify();
	}

	public synchronized void odd(int number) {
		while (!isEven) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Odd:- " + number);
		isEven = false;
		notify();
	}

	public static void main(String[] args) {

		OddEven oddEven = new OddEven();

		Thread isEven = new Thread(() -> {

			for (int i = 2; i <= 10; i += 2) {
				oddEven.even(i);
			}
		});

		Thread isOdd = new Thread(() -> {

			for (int i = 1; i <= 10; i += 2) {
				oddEven.odd(i);
			}
		});

		isEven.start();
		isOdd.start();
	}

}
