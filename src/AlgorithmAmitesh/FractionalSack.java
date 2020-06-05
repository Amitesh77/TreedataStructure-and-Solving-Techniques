package AlgorithmAmitesh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FractionalSack {
	
	public static void kanpSak(ArrayList<FractionalSackItems> items,int capacity)
	{
		
		Collections.sort(items,(o1,o2)->(o1.getRatio()>o2.getRatio()?-1:o1.getRatio()<o2.getRatio()?1:0));
		
		
		int usedcapacity=0;
		int totalvalue=0;
		
		for (FractionalSackItems item : items) {
		
			if(usedcapacity+item.getWeight()<capacity)
			{
				usedcapacity+=item.getWeight();
				
				System.out.println("Taken item  : "+item);
				
				totalvalue+=item.getValue();
			}
			
			else
			{
				int usedweight=capacity-usedcapacity;
				
				double value=item.getRatio()*usedweight;
				
				System.out.println("Taken: "+"item index = " + item.getIndex() + ",obtained value = " + value + ",used weight = " + usedweight + ", ratio = " + item.getRatio()
				+ "]");
				
				usedcapacity+=usedweight;
				totalvalue+=value;
			}
			
			if(usedcapacity==capacity)break;
			
		}
		
		System.out.println("\nTotal value obtained: "+ totalvalue);
		
	}

}
