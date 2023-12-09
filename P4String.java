package Programming;
import java.util.Scanner;

public class P4String {
	
	static boolean wordDict(String[] ar,String st)
	{
		char[] chst = st.toCharArray();
		for(int i=0;i<ar.length;i++)
		{
			char[] ch = ar[i].toCharArray();
			int j=0;
			int k=0;
			while(j<ch.length&&k<chst.length)
			{
				if()
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array");
		int n = sc.nextInt();
		String[] str = new String[n];
		System.out.println("Enter the Dict Word");
		System.out.println("Enter the String");
		String st = sc.next();
		boolean rs = wordDict(str,st);
		System.out.println(rs);
		

	}

}
