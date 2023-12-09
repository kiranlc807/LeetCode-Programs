package Programming;

import java.util.Arrays;

public class MostFrequentEvenNumber {
	
	static int frequentEven(int[] ar)
	{
		Arrays.sort(ar);
		int[] count = new int[ar.length];
		int in1=-1;
		boolean flag=true;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					count[i]++;
				}	
			}
			if(ar[i]%2==0&&flag==true)
			{
				in1=i;
				flag=false;
			}
		}
		int max_count=0;
		int in=0;
		for(int i=0;i<count.length;i++)
		{
			if(ar[i]%2==0)
			{
				if(count[i]>max_count)
				{
					max_count=count[i];
					in=i;
				}
			}
		}
		if(max_count!=0)
		{
			return ar[in];
		}
		else if(in1!=-1)
			return ar[in1];
		else
			return -1;
	}

	public static void main(String[] args) {
		int[] ar = {1000};
		Arrays.sort(ar);
		for(int i:ar)
			System.out.print(i+" ");
		int ele = frequentEven(ar);
		System.out.println();
		System.out.println(ele);

	}

}
