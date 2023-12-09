package Programming;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
	
	static int inIntgere(String roman)
	{
		HashMap<Character,Integer> hm = new HashMap<>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);
		
		int ans=0;
		for(int i=roman.length()-1;i>=0;i--)
		{
			int num = hm.get(roman.charAt(i));
			if(4*num<ans)
			{
				ans=ans-num;
			}
			else
			{
				ans=ans+num;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String roman = sc.next();
		System.out.println(inIntgere(roman));

	}

}
