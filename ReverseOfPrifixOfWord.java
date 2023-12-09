package Programming;

public class ReverseOfPrifixOfWord {
	
	static String reverse(String word,char ch) {
		int in = word.indexOf(ch);
        char[] ac = word.toCharArray();
        int i=0;
        int j=in;
        while(i<j)
        {
            char temp=ac[i];
            ac[i]=ac[j];
            ac[j]=temp;
            i++;
            j--;
        }
        String rs = new String(ac);
        return rs;
	}

	public static void main(String[] args) {
		String st = "abcdefd";
		System.out.println(reverse(st,'d'));

	}

}
