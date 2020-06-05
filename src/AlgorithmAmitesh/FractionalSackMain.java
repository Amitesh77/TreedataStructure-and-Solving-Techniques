package AlgorithmAmitesh;

import java.util.ArrayList;



public class FractionalSackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<FractionalSackItems>items = new ArrayList<>();
		int [] value = {6,2,1,8,3,5};
		int [] weight = {6,10,3,5,1,3};
		int capacity =10;
		
		//Add the user input data in Knapsack
		for(int i = 0; i<value.length;i++) {
			items.add(new FractionalSackItems(i+1, value[i], weight[i]));
		}
				
		//Send the data for further processing
		FractionalSack.kanpSak(items, capacity);

	}

}
