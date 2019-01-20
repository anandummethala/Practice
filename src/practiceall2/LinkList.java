package practiceall2;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Hero");
		ll.add("Villian");
		ll.add("Find");
		ll.add("Heroine");
		
		//ll.remove(2);
		
		//System.out.println(ll.get(2));
		ll.addFirst("Comedian");
		System.out.println(ll);

		ll.addLast("Enters");
		
		System.out.println(ll);
		//ll.set(1, "Interval");
		//System.out.println(ll.get(1));
		
		for(int i=0; i<ll.size(); i++) {
			
			System.out.println(ll.get(i));
					
		}
		
		System.out.println("*******************************");
		
		for(String str: ll) {
			
			System.out.println(str);
			
		}
		
	/*	System.out.println("*******************************");
		
		
		Iterator<String> it = ll.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		System.out.println("*******************************");
	}*/
		
		System.out.println("*******************************");
		
	int n=0;
	
	while(n<ll.size())	{
		
		System.out.println(ll.get(n));
		
		n++;
	}
		
	
	}
}


