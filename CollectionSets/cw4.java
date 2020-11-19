package CollectionSets;

import java.util.HashSet;
import java.util.Iterator;

public class cw4 {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(12);
		set.add(14);
		set.add(16);
		set.add(18);
		set.add(20);
		set.add(22);
		
		set.removeAll(set);
		
		System.out.println(set.size());

	}

}
