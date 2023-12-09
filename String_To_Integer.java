package Programming;

import java.util.Scanner;

public class String_To_Integer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		int num=0;
		int count=0;
		for(int i=0;i<ch.length;i++)
		{	
			if(ch[i]=='-')
			{
				count++;
			}
			if(ch[i]>='0'&&ch[i]<='9')
			num=num*10+Character.getNumericValue(ch[i]);
		}
		if(count==1)
		{
			num=num*-1;
		}
		System.out.println(num);

	}

}
