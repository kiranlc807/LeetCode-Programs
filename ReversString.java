package Programming;

import java.security.DomainCombiner;
import java.util.Scanner;

public class ReversString {
	
	static public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        int i=0;
        int j=k-1;
        while(i<j)
        {
            char temp = ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        String st = new String(ch);
        return st;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		int n = sc.nextInt();
		String rs = reverseStr(st,n);
		System.out.println(rs);
	}

}
