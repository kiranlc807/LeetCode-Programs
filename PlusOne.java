package Programming;

import java.util.Scanner;

public class PlusOne {
	
	static public int[] plusOne(int[] a) {
        if(a.length==1)
        {
        	if(a[0]==9)
        	{
        		int[] ar = new int[2];
        		ar[0]=1;
        		ar[1]=0;
        		return ar;
        	}
        	else
        	{
        		a[0]=a[0]+1;
        		return a;
        	}
        }
        else if(a[a.length-1]==9)
        {
        	int[] ar = new int[a.length+1];
        	ar[a.length-1]=1;
        	ar[a.length]=0;
        	return ar;
        }
        else
        {
        	a[a.length-1]=a[a.length-1]+1;
        }
        return a;
	}
        

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int[] rs = plusOne(a);
		System.out.println();
		for(int i=0;i<rs.length;i++)
		{
			System.out.print(rs[i]+" ");
		}
		

	}

}
