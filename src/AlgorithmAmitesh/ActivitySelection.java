package AlgorithmAmitesh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Algorithmtechnique.Greedy.Activity;

public class ActivitySelection {
	
	public static void activitySelection(ArrayList<Activity> activitylist)
	{
//		Comparator<Activity> sortlist=new Comparator<Activity>() {
//			
//			
//			@Override
//			public int compare(Activity o1,Activity o2)
//			{
//				return o1.getFinishTime()-o2.getStartTime();
//			}
//	
//		};
		
		Collections.sort(activitylist,(a1,a2)->(a1.getFinishTime()-a2.getStartTime()));
		
		//Collections.sort(activitylist, sortlist);
		Activity previousActivity = activitylist.get(0);
		

		//Print first job
		System.out.println("\n\nRecommended Schedule:\n"+activitylist.get(0));
		
		for (int i = 1; i < activitylist.size(); i++) {
			Activity activity=activitylist.get(i);
			
			if(activity.getStartTime()>=previousActivity.getFinishTime())
			{
				System.out.println(activity);
				previousActivity=activity;
			}
			
		}
	}

}
