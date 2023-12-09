package Programming;

import java.util.Scanner;

public class Cointains_Duplicate2 {
	
	 static public boolean containsNearbyDuplicate(int[] nums, int k) {
	        for(int i=0;i<nums.length;i++)
	        {
	            for(int j=i+1;j<nums.length;j++)
	            {
	                if(nums[i]==nums[j])
	                {
	                    if(Math.abs(i-j)<=k)
	                    {
	                        return true;
	                    }
	                }
	            }
	        }
	        return false;
	 }

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int k = sc.nextInt();
		System.out.println(containsNearbyDuplicate(ar,k));
	}

}
