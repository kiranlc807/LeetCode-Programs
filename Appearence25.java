package Programming;

import java.util.Scanner;

public class Appearence25 {
	
	static int highAccarense(int[] ar)
	{
		boolean[] rs = new boolean[ar.length];
		
		int high=0;
		int ele=0;
		for(int i=0;i<ar.length;i++)
		{
			int count=1;
			if(rs[i]!=true)
			{
				
				for(int j=i+1;j<ar.length;j++)
				{
					if(ar[i]==ar[j])
					{
						rs[j]=true;
						count++;
					}
				}
				if(count>high)
				{
					high=count;
					ele=ar[i];
				}
				
			}
			
		}
		
	return ele;
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
		
		int rs = highAccarense(ar);
		System.out.println(rs);

	}

}
