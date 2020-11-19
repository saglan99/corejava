package CollectionSets;

import java.util.HashSet;
import java.util.Iterator;

public class cw5 {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(12);
		set.add(14);
		set.add(16);
		set.add(18);
		set.add(20);
		set.add(22);
		
		if(set.size()!=0)
		{
			System.out.println("its not empty");
		}
		else
		{
			System.out.println("its an empty");
		}
	}

}
