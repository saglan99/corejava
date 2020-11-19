package CollectionSets;

import java.util.Iterator;
import java.util.TreeSet;

public class hw12 {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(12);
		set.add(3);
		set.add(16);
		set.add(4);
		set.add(20);
		set.add(6);
		int n=8;
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
		{
			int a=it.next();
			if(a>=n)
			{
				System.out.println(a);
			}
		}

	}

}
