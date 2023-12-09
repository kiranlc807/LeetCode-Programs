package Programming;
import java.util.*;

public class KthPairofSmallest {
	
	static List<List<Integer>> pairSum(int[] nums1, int[] nums2, int k){
		 List<List<Integer>> alMain = new ArrayList();
	        Arrays.sort(nums1);
	        Arrays.sort(nums2);
	        int i=0;
	        while(i<nums1.length)
	        {
	        	int j=0;
	            while(i<nums1.length&&j<nums2.length)
	            {
	                List<Integer> al = new ArrayList<Integer>();
	                al.add(nums1[i]);
	                al.add(nums2[j]);
	                alMain.add(al);
	                j++;
	            }
	            i++;
	        }
	        class ListComparator<T extends Comparable<T>> implements Comparator<List<T>> {

	        	  @Override
	        	  public int compare(List<T> o1, List<T> o2) {
	        	    for (int i = 0; i < Math.min(o1.size(), o2.size()); i++) {
	        	      int c = o1.get(i).compareTo(o2.get(i));
	        	      if (c != 0) {
	        	        return c;
	        	      }
	        	    }
	        	    return Integer.compare(o1.size(), o2.size());
	        	  }

	        	}
	        
	        Collections.sort(alMain,new ListComparator());
	        List<List<Integer>> a2 = new ArrayList();
	        
	        for(int in=0;in<k;in++)
	        {
	        	try {
	        	a2.add(alMain.get(in));
	        	}catch(Exception e)
	        	{
	        		break;
	        	}
	        }

	        
	        return a2;
		}

	public static void main(String[] args) {
		int[] nums1= {1,2};
		int[] nums2= {3};
		int k=3;
		System.out.println(pairSum(nums1,nums2,k));
		

	}

}
