package Programming;

public class Four_Divisors {
	
	static  public int divisorSum(int n)
    {
        int count=1;
        int sum=;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
                 count++;
            }
           
        }
        if(count==4)
            return sum;
        else
        	return 0; 
    }

    static public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+divisorSum(nums[i]);
        }
        return sum; 
    }

	public static void main(String[] args) {
		int[] ar = {21,4,7};
		int sum = sumFourDivisors(ar);
		System.out.println(sum);

	}

}
