package Programming;

public class AlternativeDigitSum {
	
	public int alternateDigitSum(int n) {
        int[] ar = new int[(n+"").length()];
        int i=ar.length-1;
        do{
            int r=n%10;
            ar[i--]=r;
            n=n/10;
        }while(n!=0&&i>=0);
        int sum=0;
        for(int j=0;j<ar.length;j++)
        {
            if(i%2==0)
            {
                sum=sum+(+ar[j]);
            }
            else
            {
                sum=sum+(-ar[j]);
            }
        }
        return sum;
    }

	public static void main(String[] args) {
		int n=521;
		int[] ar = new int[(n+"").length()];
		System.out.println(ar.length);
        int i=ar.length-1;
        do{
            int r=n%10;
            ar[i--]=r;
            n=n/10;
        }while(n!=0&&i>=0);
        int sum=0;
        for(int j=0;j<ar.length;j++)
        {

        	System.out.println();
        	if(j%2==0)
        	{
        		sum=sum+ar[j];
        		System.out.print(sum);
        	}
        	else
        	{
        		sum=sum+(-ar[j]);
        		System.out.print(sum);
        	}
        }
        System.out.println(sum);

	}

}
