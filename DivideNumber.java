package Programming;

import java.util.Scanner;

public class DivideNumber {

	static int divide(int a,int b)
	{	
		int count=0;
		if(b<0)
		{
			b=b*-1;
			while(b<=a)
			{
				a=a-b;
				count++;
			}
			return count*-1;

		}
		else {

			while(b<=a)
			{
				a=a-b;
				count++;
			}
			return count;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter dividend");
		int a = sc.nextInt();
		System.out.println("enter divsor");
		int b = sc.nextInt();
		int rs = divide(a,b);
		System.out.println(rs);
	}

}
