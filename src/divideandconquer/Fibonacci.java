package divideandconquer;

public class Fibonacci {
	
	public static int findFibo(int n)
	{
		if(n<1)
		{
			System.out.println("Error message");
			return Integer.MIN_VALUE;
		}
		
		else if (n==1)
		{
			return 0;
		}
		
		else if(n==2)
		{
			return 1;
		}
		
		else
		{
			return findFibo(n-1)+findFibo(n-2);
		}
		
		
	}
	
	public static void main(String[] args)
	{
		
		Fibonacci s=new Fibonacci();
		
		System.out.println("The 5th fibonacci is  :"+findFibo(6));
	}

}
