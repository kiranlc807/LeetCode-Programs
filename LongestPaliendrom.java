package Programming;

public class LongestPaliendrom {
	
	static String longSub(String s)
	{
		int max_len=0;
		String st = "";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(j-i>max_len&&isPaliendrome(s.substring(i, j)))
				{
					max_len=j-i;
					st=s.substring(i, j);
				}
			}
		}
		
		return st;
	}
	
	static boolean isPaliendrome(String st)
	{
		StringBuffer rs = new StringBuffer(st);
		rs.reverse();
		return st.equals(rs.toString());
	}

	public static void main(String[] args) {
		String s = "cbbd";
		System.out.println(longSub(s));

	}

}
