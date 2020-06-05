package AlgorithmAmitesh;

import java.util.Arrays;

public class Coin {
	
	public static void coinsRequired(int[] coins,int N)
	{
		
		int index=coins.length-1;
		Arrays.sort(coins);
		
		while(true)
		{
			int coinvalue=coins[index];
			
			index--;
			
			int maxAmount=(N/coinvalue) * coinvalue;
			
			if(maxAmount>0)
			{
				System.out.println("The Coin taken is   "+coinvalue + "    "+(N/coinvalue)+   "  times ");
				N=N-maxAmount;
			}
			
			
			
			if(N==0)
			{
				break;
			}
		}
		
	}

}
