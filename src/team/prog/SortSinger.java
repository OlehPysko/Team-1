package team.prog;

import java.util.Comparator;

public class SortSinger implements Comparator<Trek>{
	
	@Override
	public int compare(Trek o1, Trek o2) {
		 String o11 = o1.getSinger();
         String o22 = o2.getSinger();        
         return o11.compareTo(o22);
	}

}
