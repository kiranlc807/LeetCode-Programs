package Programming;

import java.util.Scanner;

public class Add_Binary {
	
	public static int binaryConvertion(int num)
	{
		int sum=0;
		int count=0;
		do {
			int r=num%10;
			sum=sum+r*pow(2,count);
			count++;
			num=num/10;
		}while(num!=0);
		return sum;
	}
	
	static int pow(int n, int pow)
	{
		int pro=1;
		while(pow!=0)
		{
			pro=pro*n;
			pow--;
		}
		return pro;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 Binary Number");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int num1 = binaryConvertion(n1);
		int num2 = binaryConvertion(n2);
		System.out.println(Integer.toBinaryString(num1+num2));
		
		
	}

}
