package Programming;

public class Max_Product {
	
	static public int maxProduct(int[] nums) {
        int pro=1;
        int max_pro=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            pro=pro*nums[i];
            if(pro>max_pro)
            {
                max_pro=pro;
            }
            if(pro==0)
            {
                pro=1;
            }
        }
        return max_pro;
	}

	public static void main(String[] args) {
		int[] ar= {3,-1,4};
		System.out.println(maxProduct(ar));

	}

}
