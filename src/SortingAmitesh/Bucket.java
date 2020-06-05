package SortingAmitesh;

import java.util.ArrayList;
import java.util.Collections;

public class Bucket {
	
	int arr[];
	
	Bucket(int[] arr)
	{
		this.arr=arr;
	}
	

	//Prints Buckets
	public void printBucket(ArrayList<Integer>[] buckets) {
		for(int i=0; i<buckets.length; i++) {
			System.out.println("\nBucket#" + i + " :");
			for (int j=0; j<buckets[i].size(); j++) {
				System.out.print(buckets[i].get(j)+"  ");
			}
		}
		
	}
	

	//Prints Array
	public void printArray() {
		int tmp = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			tmp++;
			if(tmp == 20) {
				System.out.println();
				tmp = 0;
			}
		}	
	}
	
	public void BucketSort()
	{
		int noofbuckets=(int)Math.ceil(Math.sqrt(arr.length));
		
		int minvalue=Integer.MAX_VALUE;
		int maxvalue=Integer.MIN_VALUE;
		
		
		//Find the min and max value from the array
		
		for (int value : arr) {
			
			if(value<minvalue)
			{
				minvalue=value;
			}
			
			else if(value>maxvalue)
			{
				maxvalue=value;
			}
		}
		
		//Create an array of buckets
		ArrayList<Integer>[] buckets = new ArrayList[noofbuckets];
		
		//initializing empty buckets
		
		for (int i = 0; i < buckets.length; i++) {
			
			buckets[i]=new ArrayList<Integer>();
		}
		
		//find respective bucket for each value and add to respective bucket
		
		for (int value : arr) {
			
			int bucketnumber=(int)(Math.ceil(value*noofbuckets))/maxvalue;
			buckets[bucketnumber-1].add(value);
		}
		
		System.out.println("\n\nPrinting buckets before Sorting...");
		printBucket(buckets);
		
		//Sort Buckets
		
		for (ArrayList<Integer> bucket : buckets) {
			
			Collections.sort(bucket);
		}
		
		System.out.println("\n\nPrinting buckets after Sorting...");
		printBucket(buckets);
		
		//concatanate buckets
		
		int index=0;
		for (ArrayList<Integer> bucket : buckets) {
			
			for (int value  : bucket) {
				
				arr[index]=value;
				index++;
			}
			
			
		}
		
	}
	
	
	
	
	

}
