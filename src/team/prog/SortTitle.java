package team.prog;

import java.util.Comparator;

public class SortTitle implements Comparator<Trek>{

	@Override
	public int compare(Trek o1, Trek o2) {
		 String o11 = o1.getTitle();
         String o22 = o2.getTitle();        
         return o11.compareTo(o22);
	}

}
