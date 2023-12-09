package Programming;

import java.util.*;

public class SecodLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st=sc.next();
		String num="";
		TreeSet<Integer> tr = new TreeSet<Integer>();
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				tr.add(Integer.parseInt(ch+""));
			}
		}
		int[] rs = new int[tr.size()];
		int j=0;
		for(Integer i:tr)
		{
			rs[j++]=i;
		}
		if(rs.length==1)
		{
			System.out.println(-1);
		}
		else
		{
		System.out.println(rs[rs.length-2]);
		
		}
	}

}
 