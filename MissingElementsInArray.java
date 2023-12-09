package Programming;

import java.lang.reflect.Array;
import java.util.*;

public class MissingElementsInArray {
	
	static List<Integer> missingElements(int[] ar)
	{
		Set<Integer> hs = new HashSet<Integer>();
		for(int i:ar)
			hs.add(i);
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=1;i<=ar.length;i++)
		{
			if(!hs.contains(i))
				al.add(i);
		}
		return al;	
	}

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,4};
		System.out.println(missingElements(ar));
	}
}
