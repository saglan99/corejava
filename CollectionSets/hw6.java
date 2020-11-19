package CollectionSets;

import java.util.Iterator;
import java.util.TreeSet;

public class hw6 {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("red");
		set.add("yellow");
		set.add("black");
		set.add("orange");
		
		TreeSet<String> set1 = new TreeSet<String>();
		int count=0;
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			set1.add(it.next());
		}

		Iterator<String> it1 = set1.iterator();
		while(it1.hasNext())
		{
			String b = it1.next();
			System.out.println(b);
		}
	}

}
