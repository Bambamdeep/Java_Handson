package threadDemo;

 class Task extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Task1  is running  :-" +"\n" + i);
		}
	}
}
 class Task1 extends Thread{
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+"Task2  is running  :-" +"\n" + i);
		}
	}
  
 }
 




