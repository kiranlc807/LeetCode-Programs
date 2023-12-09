package Programming;

import java.util.Scanner;

public class MaxGap {
	
	static int maximumGap(int[] ar)
	{
		if(ar.length<=2)
			return 0;
		int i=0;
		int j=1;
		int gap=0;
		while(i<ar.length&&j<ar.length)
		{
		
			if(ar[j]-ar[i]>gap)
			{
				gap=ar[j]-ar[i];
			}
			i++;
			j++;
		}
		return gap;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		int rs = maximumGap(ar);
		System.out.println(rs);

	}

}
