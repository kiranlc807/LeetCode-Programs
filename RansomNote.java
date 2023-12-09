package Programming;

import java.util.Arrays;
import java.util.Scanner;

public class RansomNote {
	
	static boolean ranSom(String s1,String s2)
	{
		char[] ch1= s1.toCharArray();
		Arrays.sort(ch1);
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch2);
		if(ch1.length<ch2.length)
			return check(ch2,ch1);
		else
			return check(ch1,ch2);
	}
	
	static boolean check(char[] ch1,char[] ch2)
	{
		int j=0;
		for(int i=0;i<ch1.length;i++)
		{

			while(i<ch1.length&&j<ch2.length&&ch1[i]==ch2[j])
			{
				j++;
				i++;
			}
			if(j==ch2.length)
				return true;
			
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1  = sc.next();
		String s2 = sc.next();
		System.out.println(ranSom(s1,s2));

	}

}
