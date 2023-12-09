package Programming;

import java.util.Scanner;

public class firstOcuuranceOfString {
	
	static public int occurance(String st1,String st2)
	{
		char[] ch1 = st1.toCharArray();
		char[] ch2 = st2.toCharArray();
		for(int i=0;i<ch1.length;i++)
		{
			int j=i;
			int k=0;
			while(j<ch1.length&&k<ch2.length&&ch1[j]==ch2[k])
			{
				j++;
				k++;
			}
			if(j-i==ch2.length)
			{
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st1 = sc.nextLine();
		String st2 = sc.nextLine();
		System.out.println(occurance(st1,st2));
		
	}

}
