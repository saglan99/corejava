package CollectionSets;

import java.util.HashSet;

public class hw2 {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(12);
		set.add(14);
		set.add(16);
		set.add(18);
		set.add(20);
		set.add(222);
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(12);
		set1.add(144);
		set1.add(16);
		set1.add(18);
		set1.add(20);
		set1.add(22);
		
		set.retainAll(set1);
		set1.retainAll(set);
		
		System.out.println(set);
		System.out.println(set1);

	}

}
