package Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		int[] ar = {0,0,1,1,1,1,2,3,3};
		LinkedHashSet<Integer> ls1 = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> ls2 = new LinkedHashSet<Integer>();
		for(int i=0;i<ar.length;i++)
		{
			if(i%2!=0)
			{
				ls1.add(ar[i]);
			}
			else
			{
				ls2.add(ar[i]);
			}
		}
		ArrayList<Integer> al = new ArrayList<>(ls1);
		al.addAll(ls2);
		Collections.sort(al);
		for(int i=0;i<al.size();i++)
		{
			ar[i]=al.get(i);
		}
		System.out.println(Arrays.toString(ar));

		

	}

}
