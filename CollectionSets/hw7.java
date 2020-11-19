package CollectionSets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class hw7 {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(12);
		set.add(14);
		set.add(16);
		set.add(18);
		set.add(20);
		set.add(222);
		
		Iterator<Integer> it = set.descendingIterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}

	}

}
