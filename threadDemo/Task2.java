package threadDemo;

public class Task2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0 ; i <=4 ; i++) {
			System.out.println("Runnable Thread Example : - " + i );
		}
	
	}

}
