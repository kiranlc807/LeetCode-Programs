package Programming;

import java.util.Scanner;

public class ReverseVowels {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String st = sc.next();
		String st = "kakekiku";
		char[] ch = st.toCharArray();
		int j=ch.length-1;
		for(int i=0;i<j;i++)
		{
			int fin=-1;
			int lin=-1;
			while(i<j)
			{
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
				{
					fin=i;
					break;
				}
				else
				{
					i++;
				}
			}
			while(j>i)
			{
				if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u')
				{
					lin=j--;
					break;
				}
				else
				{
					j--;
				}
			}
			if(fin!=-1&&lin!=-1)
			{
				char temp=ch[fin];
				ch[fin] = ch[lin];
				ch[lin]=temp;
			}
		}
		
		String ans = new String(ch);
		System.out.println(ans);
	}

}
