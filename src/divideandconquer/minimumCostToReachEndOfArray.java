package divideandconquer;

public class minimumCostToReachEndOfArray {
	
	public static int minCost(int [] [] cost,int row,int col)
	
	{
		if(row==-1 || col==-1)
		{
			return Integer.MAX_VALUE;
		}
		
		if(row==0 && col==0)
		{
			return cost[0][0];
		}
		
		
		int mincost1=minCost(cost,row-1,col);
		
		int mincost2=minCost(cost,row,col-1);
		
		int mincost=Integer.min(mincost1,mincost2);
		
		int current=cost[row][col];
		
		return mincost+current; 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] [] cost= {
				
				{4,7,8,6,4},
				{6,7,3,9,2},
				{3,8,1,2,4},
				{7,1,7,3,7},
				{2,9,8,9,3}
		};
		
		System.out.println(minCost(cost,cost.length-1,cost[0].length-1));

	}

}
