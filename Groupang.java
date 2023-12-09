package Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Groupang {
	public static void main(String[] args) {
		String st[]= {"eat","tea","tan","nat","bat","ate"};
		List<List<String>> a=new ArrayList();
		boolean rs[]=new boolean[st.length];
		
		for (int i = 0; i < st.length; i++)
		{
			
			if(rs[i]==false) {
			ArrayList<String> t=new ArrayList<String>();
			String s=st[i];
			char ch[]=s.toCharArray();
			Arrays.sort(ch);
			
			for(int j=0;j<st.length;j++)
			{
				char ch1[]=st[j].toCharArray();
				Arrays.sort(ch1);
				if(ch.length==ch1.length)
				if(Arrays.equals(ch, ch1))
				{
					t.add(st[j]);
					rs[j]=true;
				}
			}
			if(t.size()>0)
				a.add(t);}
		}
		Collections.reverse(a);
		System.out.println(a);
		
	}

}
