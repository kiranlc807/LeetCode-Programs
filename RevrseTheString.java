package Programming;

import java.util.HashMap;
import java.util.Scanner;

public class RevrseTheString {
	
	static int count(int i,int n)
	{
		int num=0;
		while(i!=0)
		{
			num=num*10+n;
			i--;
		}
		return num;
	}
	static void pNum(String st)
	{
		String[] s = st.split(" ");
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("double",2);
		hm.put("triple",3);
		hm.put("one",1);
		hm.put("two",2);
		hm.put("three",3);
		hm.put("four",4);
		hm.put("five",5);
		hm.put("six",6);
		hm.put("seven",7);
		hm.put("eight",8);
		hm.put("nine",9);
		
		for(int i=0;i<s.length;i++)
		{
			switch(s[i])
			{
			case "zero":
				System.out.print(hm.get(s[i]));
				break;
			case "one":
				System.out.print(hm.get(s[i]));
				break;
			case "two":
				System.out.print(hm.get(s[i]));
				break;
			case "three":
				System.out.print(hm.get(s[i]));
				break;
			case "four":
				System.out.print(hm.get(s[i]));
				break;
			case "five":
				System.out.print(hm.get(s[i]));
				break;
			case "six":
				System.out.print(hm.get(s[i]));
				break;
			case "seven":
				System.out.print(hm.get(s[i]));
				break;
			case "eight":
				System.out.print(hm.get(s[i]));
				break;
			case "nine":
				System.out.print(hm.get(s[i]));
				break;
			case "double":
				System.out.print(count(hm.get("double"),hm.get(s[++i])));
				break;
			case "triple":
				System.out.print(count(hm.get("triple"),hm.get(s[++i])));
				break;
			}
			
		
	}
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		pNum(st);
		
		}

	}


