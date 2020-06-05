package divideandconquer;

public class LongestcommonSubsequence {
	
	public static int commonSubsequence(String s1,String s2,int i1,int i2)
	{
		if(i1==s1.length() || i2==s2.length())
		{
			return 0;
		}
		
		String s3="";
		
		int c3=0;
		
		if(s1.charAt(i1)==s2.charAt(i2))
		{
			c3=1+commonSubsequence(s1,s2,i1+1,i2+1);
			s3=s3+s1.charAt(c3);
		}
		
		int c1=commonSubsequence(s1,s2,i1+1,i2);
		
		//s3=s3+s1.charAt(c1);
		int c2=commonSubsequence(s1,s2,i1,i2+1);
		
		//s3=s3+s2.charAt(c2);
		System.out.println(s3);
		return Math.max(c1, Math.max(c3, c2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(commonSubsequence("houdini","hdupti",0,0));

	}

}
