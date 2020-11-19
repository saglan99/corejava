package CollectionSets;

import java.util.HashSet;
import java.util.Iterator;

public class cw6 {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(12);
		set.add(14);
		set.add(16);
		set.add(18);
		set.add(20);
		set.add(22);
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		
		set2 = (HashSet<Integer>) set.clone();
		
		Iterator<Integer> it1 = set2.iterator();
		while(it1.hasNext())
		{
			int a=it1.next();
			System.out.println(a);
		}

	}

}
