package Programming;

import java.util.Arrays;

public class kth373 {
	
	static public int kthSmallest(int[][] matrix, int k) {
        int[] ar = new int[matrix.length*matrix[0].length];
        int l=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                ar[l++]=matrix[i][j];
            }
        }
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        return ar[k-1];
    }

	public static void main(String[] args) {
		int[][] ar = {{1,2},{1,3}};
		System.out.println(kthSmallest(ar,2));
		

	}

}
