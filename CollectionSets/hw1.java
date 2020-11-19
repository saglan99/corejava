package CollectionSets;

import java.util.HashSet;

public class hw1 {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(12);
		set.add(14);
		set.add(16);
		set.add(18);
		set.add(20);
		set.add(22);
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(12);
		set1.add(144);
		set1.add(16);
		set1.add(18);
		set1.add(20);
		set1.add(22);
		
		System.out.println(set.equals(set1));

	}

}
