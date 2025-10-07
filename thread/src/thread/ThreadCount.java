package thread;

public class ThreadCount extends Thread{
	public void run() {
		int i =1 ;
		for (i = 1; i<=100000;i++) {
			int sum =0;
			sum += i;
			System.out.println("thread running " + i);
			
		}
	}
public static void main(String [] args) {
	   ThreadCount t1 = new ThreadCount();
	   t1.start();
	   t1.yield();
	   
}
}
