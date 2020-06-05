package divideandconquer;

public class ConvertString {
	
	public static int findMinOperation(String S1,String S2,int i1,int i2)
	{
		
		if(i1==S1.length())    // if we have reached the end of s1, then insert all the remaining characters of s2
		{
			return S2.length()-i2;
		}
		
		if(i2==S2.length())  // if we have reached the end of s2, then delete all the remaining characters of s1
		{
			return S1.length()-i1;
		}
		
		if(S1.charAt(i1)==S2.charAt(i2))   // If the strings have a matching character, recursively match for the remaining lengths.
		{
			return findMinOperation(S1,S2,i1+1,i2+1);
		}
		
		int c1=1+findMinOperation(S1,S2,i1+1,i2);  //deletion
		int c2=1+findMinOperation(S1,S2,i1,i2+1);  //insert
		int c3=1+findMinOperation(S1,S2,i1+1,i2+1);  //replace
		
		return Math.min(c1, Math.min(c2, c3));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println(findMinOperation("table","tg7va",0,0));

	}

}
