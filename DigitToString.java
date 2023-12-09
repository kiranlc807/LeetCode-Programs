package Programming;

import java.util.HashMap;
import java.util.Scanner;

public class DigitToString {
	
	static String convert(long num)
	{
		HashMap<Character,String> hm = new HashMap<>();
		hm.put('0', "zero");
		hm.put('1', "one");
		hm.put('2', "two");
		hm.put('3', "three");
		hm.put('4', "four");
		hm.put('5', "five");
		hm.put('6', "six");
		hm.put('7', "seven");
		hm.put('8', "eight");
		hm.put('9', "nine");
		
		String st = "";
		String s= num+"";
		char[] ch =s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			int j=i+1;
			int count=0;
			while(j<ch.length&&i<ch.length&&ch[i]==ch[j])
			{
				j++;
				i++;
				count++;
			}
			if(count==1)
				st=st+"double "+hm.get(ch[i])+" ";
			else if(count==2)
				st=st+"triple "+hm.get(ch[i])+" ";
			else
				st=st+hm.get(ch[i])+" ";
		}
		return st;
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		long n = sc.nextLong();
		String st = convert(n);
		System.out.println(st);

	}

}
