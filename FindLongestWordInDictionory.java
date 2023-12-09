package Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindLongestWordInDictionory {

	static String findLong(String s,List<String> al)
	{
		char[] ch = s.toCharArray();
		int max_count=0;
		int index=0;
		for(int i=0;i<al.size();i++)
		{
			int count=0;
			for(int j=0;j<ch.length;j++)
			{
				if(al.get(i).contains(ch[j]+""))
				{
					count++;
				}
			}
			if(count>max_count)
			{
				max_count=count;
				index=i;
			}
		}
		return al.get(index);
	}

	public static void main(String[] args) {
		String s = "abpcplea";
		ArrayList<String> al = new ArrayList<String>();
		//["ale","apple","monkey","plea"]
		al.add("ale");
		al.add("apple");
		al.add("monkey");
		al.add("plea");
		System.out.println(findLong(s,al));



	}

}
