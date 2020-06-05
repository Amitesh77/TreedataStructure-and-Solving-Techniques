
public class MinimumSwaptoSortTheArray {
	
	
		
		static int minimumSwaps(int[] arr) {
			int swap=0;
			boolean visited[]=new boolean[arr.length];

			for(int i=0;i<arr.length;i++){
				int j=i,cycle=0;

				while(!visited[j]){
					visited[j]=true;
					j=arr[j]-1;
					cycle++;
				}
				
				if(cycle!=0)
					swap+=cycle-1;
			}
			return swap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {1,4,3,1,2};
		
		System.out.println(minimumSwaps(array));
		
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
		
			
			System.out.println(array[i]);
		}

	}

}
