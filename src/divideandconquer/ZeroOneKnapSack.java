package divideandconquer;

public class ZeroOneKnapSack {
	
	public static int maxprofit(int[] profit,int[] weight,int capacity,int currentindex)
	{
		
		if(capacity<=0 || currentindex<0 || currentindex>=profit.length)
		{
			return 0;
		}
		
		int profit1=0;
		
		if(weight[currentindex]<=capacity)  
		{
			profit1=profit[currentindex]+maxprofit(profit,weight,capacity-weight[currentindex],currentindex+1);
			
		}
			
			int profit2=maxprofit(profit,weight,capacity,currentindex+1);
			
		
			
			return Math.max(profit1, profit2);
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] profit= {31,34,6,7};
		
		int [] weight= {3,1,5,2};
		
		System.out.println(maxprofit(profit,weight,7,0));

	}

}
