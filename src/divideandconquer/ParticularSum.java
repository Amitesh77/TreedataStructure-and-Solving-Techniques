package divideandconquer;

import java.util.Arrays;
import java.util.Collections;

public class ParticularSum {
	
	
	public static int Currsum(int[] arr ,int k)
	{
		int used=0;
		int count=0;
		
		Arrays.parallelSort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			
			if(used+arr[i]<k)
			{
				used+=arr[i];
				count++;
			}
			
			if(used==0)
			{
				break;
			}
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr []= {3,5,2,45,67,43,12,4,5,67,};
		System.out.println(Currsum(arr,67));

	}

}
