package Programming;

public class ValidPaliendrome {
	
	static public boolean isPalindrome(String s) {
		s=s.toLowerCase();
        String  st="";
        for(int i=0;i<s.length();i++)
        {
        	char ch = s.charAt(i);
        	if(ch>='a'&&ch<='z')
        	{
        		st=st+ch;
        	}
        }
        System.out.println(st);
        int i=0;
        int j=st.length()-1;
        while(i<j)
        {
        	if(st.charAt(i)!=st.charAt(j))
        		return false;
        	
        	i++;
        	j--;
        }
        return true;
        
    }

	public static void main(String[] args) {
		String st = "A man, a plan, a canal: Panama" ;//   amanaplanacanalpanama amanaplanacanalpanama
		System.out.println(isPalindrome(st));

	}

}
