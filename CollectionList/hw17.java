package CollectionList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class hw17 {

	public static void main(String[] args) {
		
		List<Integer> arr = new LinkedList<Integer>();
		arr.add(4);
		arr.add(2);
		arr.add(3);
		arr.add(19);
		
		arr.remove(0);
		arr.remove(2);
	
		Iterator<Integer> it = arr.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
