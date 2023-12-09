package Programming;

import java.util.Scanner;

public class PrimeCount {
	
	static boolean checkPrime(int n)
    {
        for(int i=2;i*i<n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    static public int countPrimes(int n) {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            boolean rs = checkPrime(i);
            if(rs)
                count++;
        }
        return count;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = countPrimes(n);
		System.out.println(c);

	}

}
