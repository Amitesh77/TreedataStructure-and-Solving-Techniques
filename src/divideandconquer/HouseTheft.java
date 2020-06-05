package divideandconquer;

public class HouseTheft {
	
	public static int maxmoneyRecursive(int HousenetWorth[],int currentindex)
	{
		
		if(currentindex>=HousenetWorth.length)
		{
			return 0;
		}
		
		int stealCurrentHouse=HousenetWorth[currentindex]+maxmoneyRecursive(HousenetWorth,currentindex+2);
		
		int skipcurrenthouse=maxmoneyRecursive(HousenetWorth,currentindex+1);
		
		return Math.max(stealCurrentHouse, skipcurrenthouse);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int HouseNetWorth []= {3,5,2,45,67,43,12,4,5,67,};
		System.out.println(maxmoneyRecursive(HouseNetWorth,0));

	}

}
