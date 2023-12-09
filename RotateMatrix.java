package Programming;

class RotateMatrix {

	public static void main(String[] args) {
		int[][] mat = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		int[][] trans = new int[mat[0].length][mat.length];
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				trans[j][i]=mat[i][j];
				
			}
		}
		for(int i=0;i<trans.length;i++)
		{
			for(int j=0;j<trans[0].length;j++)
			{
				System.out.print(trans[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<trans.length;i++)
		{
			int j=0;
			int k=trans[0].length-1;
			while(j<k)
			{
				int temp = trans[i][k];
				trans[i][k]=trans[i][j];
				trans[i][j]=temp;
				j++;
				k--;
			}
		}
		for(int i=0;i<trans.length;i++)
		{
			for(int j=0;j<trans[0].length;j++)
			{
				System.out.print(trans[i][j]+" ");
			}
			System.out.println();
		}
		Math.m
	}
}
