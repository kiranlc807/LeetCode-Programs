package Programming;

import java.util.Scanner;

public class ClosurSum {

	static int closeSum(int num)
	{
		
		String st = num+"";
		int sum=0;
		int i=0;
		int j=st.length()-1;
		if(st.length()%2==0)
		{
			while(i<j)
			{
				sum=sum+Integer.parseInt(st.charAt(i)+""+st.charAt(j));
				i++;
				j--;
			}
			return sum;
		}
		else
		{
			while(i<j)
			{
				sum=sum+Integer.parseInt(st.charAt(i)+""+st.charAt(j));
				i++;
				j--;
			}
			return sum+Integer.parseInt(st.charAt(i)+"");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(closeSum(n));
	}

}
