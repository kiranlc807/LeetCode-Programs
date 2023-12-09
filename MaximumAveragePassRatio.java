package Programming;

import java.util.Arrays;
import java.util.Formatter;

public class MaximumAveragePassRatio {

	public static void main(String[] args) {
		int[][] mat = {{2,4},{3,9},{4,5},{6,14}};
		int ext=4;
		int k=0;
		int l=0;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				if(mat[i][j]<mat[k][l])
				{
					k=i;
					l=j;
				}
			}
		}
		mat[k][l]+=ext;
		mat[k][l+1]+=ext;
		
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		int d=1;
		int n=0;
		double asum=0;
		for(int i=0;i<mat.length;i++)
		{
			double a1=mat[i][n];
			double a2=mat[i][d];
			asum=asum+a1/a2;
		}
		Formatter fm = new Formatter();
		fm.format("%.5f ",asum/mat.length);
		System.out.println(fm);
		
		
		

	}

}
