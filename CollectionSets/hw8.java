package CollectionSets;

import java.util.Iterator;
import java.util.TreeSet;

public class hw8 {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(12);
		set.add(14);
		set.add(16);
		set.add(18);
		set.add(20);
		set.add(222);
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			break;
		}
		
		Iterator<Integer> it1 = set.descendingIterator();
		while(it1.hasNext())
		{
			System.out.print(it1.next()+" ");
			break;
		}

	}

}
