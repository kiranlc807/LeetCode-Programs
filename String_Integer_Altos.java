package Programming;

import java.util.Scanner;

public class String_Integer_Altos {
	
	static int StringToInt(String st)
	{
		int i=0;
		int n=st.length();
		while(i<n&&st.charAt(i)==' ')
		{
			i++;
		}
		int positive=0;
		int negative=0;
		if(i<n&&st.charAt(i)=='-')
		{
			negative++;
			i++;
		}
		if(i<n&&st.charAt(i)=='+')
		{
			positive++;
			i++;
		}
		
		double ans =0;
		while(i<n&&st.charAt(i)>='0'&&st.charAt(i)<='9')
		{
			ans=ans*10+st.charAt(i)-'0';
			i++;
		}
		if(negative>0)
		{
			ans=-ans;
		}
		if(positive>0&&negative>0)
		{
			return 0;
		}
		if(ans>Integer.MAX_VALUE)
		{
			ans=Integer.MAX_VALUE;
		}
		if(ans<Integer.MIN_VALUE)
		{
			ans=Integer.MIN_VALUE;
		}
		
		return (int) ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		System.out.println(StringToInt(st));

	}

}
