package Programming;
import java.util.Scanner;

public class P2 {
	
	static int targetSub(int[] ar, int tr) {
		
		int count=0;
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
			if(sum!=tr)
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
		System.out.println("Enter the target elements");
		int tr = sc.nextInt();
		
		int rs = targetSub(ar,tr);
		System.out.println(rs);

	}



}
