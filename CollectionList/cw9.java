package CollectionList;

import java.util.ArrayList;
import java.util.Iterator;

public class cw9 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(4);
		arr.add(2);
		arr.add(3);
		arr.add(1);
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		for(int i=arr.size()-1;i>=0;i--)
		{
			int a=arr.get(i);
			arr1.add(a);
		}
		
		Iterator<Integer> it = arr1.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
		
		

	}

}
