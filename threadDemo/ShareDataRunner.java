package threadDemo;

public class ShareDataRunner {

	public static void main(String[] args) {

		ShareData shareData = new ShareData();
		Thread write = new Thread(new WriterThread(shareData));
		Thread read = new Thread(new ReaderThread(shareData));
		write.start();
		read.start();

	}

}
