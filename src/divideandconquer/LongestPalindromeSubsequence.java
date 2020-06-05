package divideandconquer;

public class LongestPalindromeSubsequence {
	
	public static int LPS(String s,int startindex,int endindex)
	{
		if(startindex>endindex)
		{
			return 0;
		}
		
		if(startindex==endindex)
		{
			
			
			return 1;
		}
		
		int c3=0;
		
		if(s.charAt(startindex)==s.charAt(endindex))
		{
			
			c3=2+LPS(s,startindex+1,endindex-1);
			System.out.println(s.charAt(c3));
		}
		
		int c1=0+LPS(s,startindex+1,endindex);
		
		
		int c2=0+LPS(s,startindex,endindex-1);
		
		
		return Math.max(c3, Math.max(c1, c2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="elrmenmet";
		
		System.out.println(LPS(s,0,s.length()-1));

	}

}
