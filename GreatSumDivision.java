package Programming;

import java.util.Scanner;

public class GreatSumDivision {

	static int greatDivision(int[] ar)
	{

		int great=0;
		for(int i=0;i<ar.length;i++)
		{
			int sum=0;
			for(int j=0;j<ar.length;j++)
			{
				if((sum+ar[i])%3==0)
				{
					sum=sum+ar[i];
					great = sum;
				}
			}
		}
		return great;
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
		int rs = greatDivision(ar);
		System.out.println(rs);

	}

}
