package Programming;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumIceCreamBar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int coins = sc.nextInt();
		Arrays.sort(ar);
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<=coins)
			{
				coins=coins-ar[i];
				count++;
			}
			else
				break;
		}
		
		System.out.println(count);
	}

}
