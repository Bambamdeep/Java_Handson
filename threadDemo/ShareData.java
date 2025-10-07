package threadDemo;

 class ShareData {
	 volatile boolean  flag = true;
	 
}
class WriterThread implements Runnable{
	ShareData data;

	public WriterThread(ShareData data) {
		super();
		this.data = data;
	}

	@Override
	public void run() {
	System.out.println("WriteThread Started.....");
	System.out.println("writerThread changing flasg to false");
	data.flag = false;
		
	}
	
}

class ReaderThread implements Runnable{
	ShareData data;

	public ReaderThread(ShareData data) {
		super();
		this.data = data;
	}

	@Override
	public void run() {
		System.out.println("Reader Thread Started.....");
		while(data.flag) {
			
		}
		System.out.println("Reader detected flag change... ");
	}
	
}

















