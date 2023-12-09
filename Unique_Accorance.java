package Programming;
import java.util.*;

public class Unique_Accorance {
	
	 static public boolean uniqueOccurrences(int[] ar) {
	        HashMap<Integer,Integer> hm = new HashMap<>(); 
	        for(int i=0;i<ar.length;i++)
	        {
	            if(!hm.containsKey(ar[i]))
	            {
	                hm.put(ar[i],1);
	            }
	            else
	            {
	                hm.put(ar[i],hm.get(ar[i])+1);
	            }
	        }
	        HashSet<Integer> hs = new HashSet<>();  
	        for(Integer key:hm.keySet())
	        {
	        	if(hs.add(hm.get(key))==false)
	        		return false;
	        }
	        return true;  
	    }

	public static void main(String[] args) {
		int[] ar = {-3,0,1,-3,1,1,1,-3,10,0};
		System.out.println(uniqueOccurrences(ar));

	}

}
