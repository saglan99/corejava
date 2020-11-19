package CollectionList;

import java.util.ArrayList;
import java.util.Iterator;

public class hw1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(4);
		arr.add(2);
		arr.add(3);
		arr.add(1);
		
		Iterator<Integer> it = arr.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next());
		}

	}

}
