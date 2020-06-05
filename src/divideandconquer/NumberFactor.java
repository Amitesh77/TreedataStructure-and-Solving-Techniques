package divideandconquer;

public class NumberFactor {
	
	public static int waystogetN(int n)
	{
		if(n==0 || n==1 || n==2)
		{
			return 0;
		}
		
		else if(n==3)
		{
			return 2;  //{1,1,1} {3}
		}
		
		else
		{
			int substract1=waystogetN(n-1);
			int substract2=waystogetN(n-2);
			int substract3=waystogetN(n-3);
			
			return substract1+substract2+substract3;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(waystogetN(8));

	}

}
