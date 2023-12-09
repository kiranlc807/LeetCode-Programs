package Programming;

import java.util.Arrays;
import java.util.TreeSet;

public class DistictAvarage{
	public static void main(String[] args) {
		int[] ar = {4,1,4,0,3,5};
		Arrays.sort(ar);
		int i=0;
		int j=ar.length-1;
		TreeSet<Double> tr = new TreeSet<Double>();
		while(i<j)
		{
			double avg = (ar[i]+ar[j])/2.0;
			tr.add(avg);
			i++;
			j--;
		}
		System.out.println(tr.size());
	}

}
