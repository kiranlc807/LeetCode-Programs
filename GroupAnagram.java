package Programming;
import java.util.*;

public class GroupAnagram {
	
	static List<List<String>> groupAna(String[] st)
	{
		Map<String,List<String>> map = new HashMap<>();
		for(int i=0;i<st.length;i++)
		{
			char[] ch = st[i].toCharArray();
			Arrays.sort(ch);
			String sortedWord = new String(ch);
			if(!map.containsKey(sortedWord))
			{
				map.put(sortedWord, new ArrayList<String>());
			}
			map.get(sortedWord).add(st[i]);
		}
		return new ArrayList(map.values());
	}

	public static void main(String[] args) {
		String[] st = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAna(st));

	}

}
