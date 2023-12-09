package Programming;

import java.util.Scanner;

public class isSubsequnce {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		String rs ="";
		int j=0;
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]==ch2[j])
			{
				rs=rs+ch1[i];
				j++;
			}
			if(j==ch2.length)
				break;
		}
		
		System.out.println(s2.equals(rs));
	}

}
