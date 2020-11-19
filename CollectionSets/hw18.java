package CollectionSets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class hw18 {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(12);
		set.add(3);
		set.add(16);
		set.add(4);
		set.add(20);
		set.add(6);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int count=0;
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
		{
			int b = it.next();
			arr[count++]=b;
			
		}

	}

}
