package CollectionSets;

import java.util.Iterator;
import java.util.TreeSet;

public class hw9 {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(12);
		set.add(14);
		set.add(16);
		set.add(18);
		set.add(20);
		set.add(222);
		
		TreeSet<Integer> set1 = new TreeSet<Integer>();
		
		set1=(TreeSet<Integer>) set.clone();
		
		Iterator<Integer> it = set1.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}

	}

}
