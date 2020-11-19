package CollectionSets;

import java.util.HashSet;
import java.util.Iterator;

public class cw7 {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(12);
		set.add(14);
		set.add(16);
		set.add(18);
		set.add(20);
		set.add(22);
		
		int[] arr=new int[set.size()];
		int count=0;
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
		{
			arr[count++]=it.next();
		}
		
		for(int p:arr)
		{
			System.out.println(p);
		}
	
		
		
		

	}

}
