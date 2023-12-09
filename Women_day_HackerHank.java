package Programming;

import java.util.Arrays;
import java.util.Scanner;

public class Women_day_HackerHank {

	static int[] arrayOperation(int[] ar,int in) {
		if(in==ar.length-1)
		{
			return ar;
		}
		int[] rs = new int[ar.length-1];
		rs[in]=ar[in+1]%ar[in];
		int j=0;
		for(int i=0;i<ar.length;i++)
		{
			if(i<in||i>in)
				rs[j++]=ar[i];

		}
		return rs;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int in = sc.nextInt();
		int[] rs = arrayOperation(ar,in);
		for(int i=0;i<rs.length;i++)
		{
			System.out.println(rs[i]);
		}
	}

}
