package Programming;

import java.util.Scanner;

public class fraction_to_recurring_decimal {
	
	static String fraction(double n1,double n2)
	{
		if(n1%n2==0)
			return ((int)(n1/n2))+"";
		Double fraction= n1/n2;
		if((fraction+"").length()<5)
			return fraction+"";
		String st=(fraction+"").substring(0,5);
		String rs="";
		char[] ch=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==2)
			{
				rs=rs+"("+ch[i];
			}
			else
			{
			rs=rs+ch[i];
			}
		}
		return rs+")";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println(fraction(n1,n2));

	}

}
