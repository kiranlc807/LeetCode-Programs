package Programming;

import java.util.Scanner;

public class Reverse_Word {
	
	static String reverseWord(String st) {
		String s = st.trim();
		String[] as = s.split(" ");
		String rs = "";
		for(int i=as.length-1;i>=0;i--)
		{
			if(i!=0)
			{
				rs=rs+as[i]+" ";
			}
			else
			{
				rs=rs+as[i];
		
			}
		}
		return rs;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String rs = reverseWord(st);
		System.out.println(rs);

	}

}
