package Programming;

import java.util.Scanner;
import java.math.*;

public class LastWordCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st1 = sc.nextLine();
		String  st2= st1.trim();
		String[] st = st2.split(" ");
		int count = st[st.length-1].length();


	}

}
