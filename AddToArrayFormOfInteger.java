package Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddToArrayFormOfInteger {
	
	static public List<Integer> addToArrayForm(int[] num, int k) {
        long sum=0l;
        for(int i=0;i<num.length;i++)
        {
            sum=sum*10+num[i];
        }
        sum=sum+k;
        String st=sum+"";
        List<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<st.length();i++)
        {
            al.add(Integer.parseInt(st.charAt(i)+""));
        }
        return al; 
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int[] ar2 = Arrays.copyOf(ar, ar.length);
		System.out.println(Arrays.toString(ar2));
	}

}
