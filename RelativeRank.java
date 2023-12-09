package Programming;

public class RelativeRank {
	
	

	public static void main(String[] args) {
		int[] score = {5,4,3,2,1};
		int frst=0;
        int scnd=0;
        int thrd=0;
        for(int i=0;i<score.length;i++)
        {
            if(frst<score[i])
                frst=score[i];
            else if(scnd<score[i]&&scnd!=frst)
                scnd=score[i];
            else if(thrd<score[i]&&thrd!=scnd)
                thrd=score[i];
        }
        
        System.out.println(frst+""+scnd+""+thrd);
	}

}
