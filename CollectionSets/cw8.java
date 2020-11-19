package CollectionSets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class cw8 {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(12);
		set.add(14);
		set.add(16);
		set.add(18);
		set.add(20);
		set.add(22);
		
		TreeSet<Integer> set1 = new TreeSet<Integer>();
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
		{
			set1.add(it.next());
		}
		
		Iterator<Integer> it1 = set1.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
		
		
	}

}
