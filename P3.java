package Programming;
import java.util.Scanner;

public class P3 {
	
	static int[] sortArray(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[j]<ar[i])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		
		boolean[] rs= new boolean[ar.length];
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
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
			}
		}
		int[] arr = new int[ar.length-count];
		int k=0;
		for(int i=0;i<ar.length;i++)
		{
			if(rs[i]!=true)
			{
				arr[k++]=ar[i];
			}
				
		}
		return arr;
		
	}
	
	static int logestConsi(int[] ar)
	{
		int count=1;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]+1==ar[i+1])
				count++;
				
		}
		return count;
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
		int[] rs = sortArray(ar);
		for(int i=0;i<rs.length;i++)
		{
			System.out.print(rs[i]+" ");
		}
 
		System.out.println();
		int ele = logestConsi(rs);
		System.out.println(ele);
	}

}
/**
 * 		while(i<ar.length&&j<ar.length)
		{
			if(ar[i+1]==ar[j])
				count++;
			i++;
			j++;
		}
*/
