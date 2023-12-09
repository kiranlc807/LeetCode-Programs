package Programming;

import java.util.Scanner;

public class CountNicePairsInArray {
	
	static int countNicePairs(int[] ar)
	{
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=ar.length-1;i<j;j--)
			{
				if((ar[i]+rev(ar[j]))==(ar[j]+rev(ar[i])))
						count++;
			}
		}
		return count;
	}
	
	static int rev(int n)
	{
		int rev=0;
		do {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}while(n!=0);
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		System.out.println(countNicePairs(ar));
	}

}
