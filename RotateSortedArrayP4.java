package Programming;
import java.util.Scanner;

public class RotateSortedArrayP4 {
	
	static int[] rotateArray(int[] ar,int n)
	{
		int[] rs = new int[ar.length];
		int j=0;
		for(int i=n;i<ar.length;i++)
		{
			rs[j++]=ar[i];
		}
		for(int i=0;i<n;i++)
		{
			rs[j++]=ar[i];
		}
		return rs;
		
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
		System.out.println("Enter the rotation");
		int n1 = sc.nextInt();
		int[] rs = rotateArray(ar,n1);
		for(int i=0;i<rs.length;i++)
		{
			System.out.print(rs[i]+" ");
		}
		
	}

}
