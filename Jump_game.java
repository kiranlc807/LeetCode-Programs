package Programming;

import java.util.Scanner;

public class Jump_game {
	
	static boolean jump(int[] ar)
	{
		if(ar[0]==0)
		{
			return false;
		}
		int i=1;
		while(i<ar.length)
		{
			i=ar[i];
			if(ar[i]==0)
			{
				return false;
			}
			if(i==ar.length-1)
			{
				return true;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println(jump(ar));
	}

}
