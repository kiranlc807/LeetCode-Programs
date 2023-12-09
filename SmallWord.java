package Programming;

import java.util.Scanner;

public class SmallWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();
		
		String[] str = st.split(" ");
		int len = str[0].length();
		int in= 0;
		for(int i=1;i<str.length;i++)
		{
			int st1 = str[i].length();
			if(st1<len)
			{
				len=str[i].length();
				in=i;
			}
		}
		System.out.println(str[in]);

	}

}
