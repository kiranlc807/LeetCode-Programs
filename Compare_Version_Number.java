package Programming;

import java.util.Scanner;

public class Compare_Version_Number {
	
	static int verCompare(String ver1,String ver2)
	{
		Double v1=Double.parseDouble(ver1);
		Double v2=Double.parseDouble(ver1);
		return v1.compareTo(v2);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ver1 = sc.next();
		String ver2 = sc.next();
		System.out.println(verCompare(ver1,ver2));

	}

}
