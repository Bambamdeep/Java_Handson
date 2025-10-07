package threadDemo;

public class WaitNotifyDemoRunner {

	public static void main(String[] args) {
		WaitNotifyDemo waitNotifyDemo = new WaitNotifyDemo();

		Thread threadProduce = new Thread(() -> {

			for (int i = 1; i <= 4; i++) {
				waitNotifyDemo.produce(i);
				
			}
			

		});
		
Thread threadConsume = new Thread (()->{
	
	for (int i =1 ; i<=4 ;i++) {
		waitNotifyDemo.consume();
		
	}
	
	
	
});
		threadProduce.start();
		threadConsume.start();

	}

}
