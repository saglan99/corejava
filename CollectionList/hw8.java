package CollectionList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class hw8 {

	public static void main(String[] args) {
		
		List<Integer> arr = new LinkedList<Integer>();
		arr.add(4);
		arr.add(2);
		arr.add(3);
		arr.add(19);
		
		ListIterator<Integer> it = arr.listIterator(4);
		while(it.hasPrevious())
		{
			System.out.print(it.previous()+" ");
		}

	}

}
