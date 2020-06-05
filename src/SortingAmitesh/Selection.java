package SortingAmitesh;

public class Selection {
	
	public void selectionSort(int [] arr)
	{
		for (int j = 0; j < arr.length; j++) {
			
			int minimumindex=j;
			
			for (int i = j+1; i < arr.length; i++) {
				
				if(arr[i]<arr[minimumindex])
				{
					minimumindex=i;
				}

				
			}
			
			if(minimumindex!=j)  //swap
			{
				int temp=arr[j];
				
				arr[j]=arr[minimumindex];
				
				arr[minimumindex]=temp;
			}
		}
	}
	

	public static void printArray(int []array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}

}
