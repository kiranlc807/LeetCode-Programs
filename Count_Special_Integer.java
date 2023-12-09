package Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Count_Special_Integer {
	
	static int countSpecialInt(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(distinct(i))
			{
				count++;
			}
		}
		return count;
	}
	
	static boolean distinct(int n)
	{
		HashSet<Character> hs = new HashSet<Character>();
		
		char[] ch = (n+"").toCharArray();
		Arrays.sort(ch);
		for(int i=0;i<ch.length;i++)
		{
			if(hs.add(ch[i])==false)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
		System.out.println(countSpecialInt(78350035));
		

	}

}
