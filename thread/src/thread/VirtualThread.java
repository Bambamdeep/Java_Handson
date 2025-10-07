package thread;

import java.util.LinkedList;
import java.util.Queue;

public class VirtualThread {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder ("this is deepak");
		
	sb.reverse();
	System.out.println(sb);
	
	Queue <String> q = new LinkedList<String>();
	q.offer("deepak");
	q.add("kumar");
	
	
	System.out.println(q.peek());
	System.out.println(q);
	System.out.println(q.poll());
	System.out.println(q);
	

	}

}
