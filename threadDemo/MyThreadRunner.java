package threadDemo;

public class MyThreadRunner {

	public static void main(String[] args) throws InterruptedException {
		Task task1 = new Task();
		Task1 task2 = new Task1();
		task1.start();
		task1.join();
		
		//task1.sleep(5000);// sleep to 5 sec to simulate working);
	//	task2.setPriority(Thread.MAX_PRIORITY);
		 task2.start();
		
	
	// new Task1().start();
		
	/*
      Thread th = new Thread (new Task2());
	   //Thread.sleep(10000);
      th.start();
      // you can mark deamon thrad by calling setDeamon (trur)
     
	}
	*/
	}

}
