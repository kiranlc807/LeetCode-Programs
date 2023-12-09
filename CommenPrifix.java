package Programming;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class CommenPrifix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();
		String rs="";
		char[] ch = st.toCharArray();
		int i=0;
		LinkedHashSet<Character> ll = new LinkedHashSet<Character>();
		while(i<ch.length)
		{
			int j=i;
			int k=i;
			while(k<ch.length&&ch[k]!=' ')
			{
				k++;
			}
			int a = k+1;
			while(j<ch.length&&a<ch.length&&ch[j]==ch[a])
			{
				ll.add(ch[j]);
				j++;
				a++;
			}
			i=k+1;
		}
		
		for(Character c : ll)
			System.out.print(c);

	}

}
