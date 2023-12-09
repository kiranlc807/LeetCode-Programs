package Programming;

import java.util.Arrays;
import java.util.Scanner;

public class  StringToIntger{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String st = sc.next();
		st=st.trim();
		int count=0;
		int rs=0;
		char[] ch = st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==0&&ch[i]=='-')
				count++;
			
			if(ch[i]>='0'&&ch[i]<='9')
				rs=rs*10+(int)ch[i]-48;
		}
		if(count==1)
			System.out.println(rs=rs*-1);
		else
			System.out.println(rs);
	}

}
