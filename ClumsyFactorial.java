package Programming;

public class ClumsyFactorial {
	
	static public int clumsy(int n) {
        int count=1;
        int pro=n;
        n=n-1;
        System.out.println(n);
        while(n!=0)
        {
            if(count==1)
            {
                pro=pro*n;
                n--;
                System.out.println(pro);
                count++;
            }
            else if(count==2)
            {
            	pro=pro/n;
            	n--;
            	System.out.println(pro);
            	count++;
            }
            else if(count==3)
            {
                pro=pro+n;
                n--;
                System.out.println(pro);
                count++;
            }
             else if(count==4)
             {
                pro=pro-n;
                n--;
                System.out.println(pro);
                count++;
             }
            if(count==5)
            	count=1;
        }
        return pro;
	}

	public static void main(String[] args) {
		int n=10;
		System.out.println(clumsy(n));

	}

}
