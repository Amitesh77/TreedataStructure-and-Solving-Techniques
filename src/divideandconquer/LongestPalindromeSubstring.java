package divideandconquer;

public class LongestPalindromeSubstring {
	
	public static int LPS(String s,int start,int end)
	
	{
		if(start>end)
		{
			return 0;
		}
		
		if(start==end)
		{
			return 1;
		}
		
		int c3=0;
		
		if(s.charAt(start)==s.charAt(end))
		{
			int remaininglength=end-start-1;
			
			if(remaininglength==LPS(s,start+1,end-1))
			{
				c3=remaininglength+2;
			}
		}
		
		int c1=LPS(s,start+1,end);
		
		int c2=LPS(s,start,end-1);
		
		return Math.max(c3, Math.max(c1, c2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="MQADASM";
		
		System.out.println(LPS(s,0,s.length()-1));

	}

}
