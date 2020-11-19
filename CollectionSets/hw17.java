package CollectionSets;

import java.util.Iterator;
import java.util.TreeSet;

public class hw17 {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(12);
		set.add(3);
		set.add(16);
		set.add(4);
		set.add(20);
		set.add(6);
		
		set.pollLast();
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
		{
			int a=it.next();
			System.out.println(a);
			
		}

	}

}
