package Programming;

import java.util.HashSet;

public class SuccsesiveArray {
	
	static int digits(int n)
	{
		int sum=0;
		do {
			int r = n%10;
			sum=sum+r;
			n=n/10;
		}while(n!=0);
		return sum;
	}
	static boolean isSuccsesive(int[] ar) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<ar.length;i++)
		{
			if(hs.add(digits(ar[i]))==false)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] ar = {24,34,48,32,53};
		boolean rs = isSuccsesive(ar);
		System.out.println(rs);
	}

}
