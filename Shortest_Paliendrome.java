package Programming;

import java.util.Scanner;

public class Shortest_Paliendrome {
	
	static String shortPali(String st)
	{
		StringBuffer st1 = new StringBuffer(st);
		StringBuffer st2=st1.reverse();
		if(st.equals(st1+""))
			return st2.toString();
		String rs = st2.toString();
		String pali = rs;
		for(int i=rs.length()-2;i>=0;i--)
		{
			pali=pali+rs.charAt(i);
			if(pali.equals(new StringBuffer(pali).reverse()+""))
				return pali;
		}
		return pali;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		System.out.println(shortPali(st));
		

	}

}
/**
StringBuffer rs = new StringBuffer(st);
StringBuffer s1=rs.reverse();
if(st.equals(s1))
	return s1.toString();
for(int i=1;i<st.length();i++)
{
	s1.append(st.charAt(i));
	if(s1.equals(s1.reverse()))
		return s1.toString();
	
}
return s1.toString();
*/