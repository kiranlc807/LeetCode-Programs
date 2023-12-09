package Programming;

import java.util.Arrays;

public class OddAssendingEvenDesending {

	public static void main(String[] args) {
		int[] ar = {23,32,46,81,34,58};
		Arrays.sort(ar);//{23,32,34,46,58,81};
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]+" ");
		}
		int[] rs = new int[ar.length];
		int x=0;
		int y=rs.length-1;
		for(int i=rs.length-1;i>=0;i--)
		{
			if(ar[i]%2==0)
			{
				rs[y--]=ar[i];
			}
			else {
				rs[x++]=ar[i];
			}
		}
		
		for(int i=0;i<rs.length;i++)
		{
			System.out.print(rs[i]+" ");
		}

	}

}
