package Programming;

import java.util.ArrayList;
import java.util.Scanner;

public class Sp {
	
	public static int count(int i) 
	{
		ArrayList<Integer>al=new ArrayList();
		
		for (int j = 1; j <=i; j++) 
		{
			
			int a[]=new int[10];
			
			int n=j;
			
			do{
				int r=n%10;
				if(a[r]==0)
					a[r]++;
				else 
					break;
				n/=10;
			}while(n!=0);
			if(n==0)
				al.add(j);
			
		}
		return al.size();
	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
		//System.out.println(countSpecialInt(num));
		System.out.println(count(78350035));

	}

}
