package CollectionsMaps;

import java.util.Comparator;

public class cw14 implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
			int a = o1.compareTo(o2);
			if(a==0)
				return 0;
			else if(a<0)
				return -1;
			else
				return 1;
			
			

	}
	
}
