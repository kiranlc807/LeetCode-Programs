package Programming;

public class SetMatrixZero {
	
	static void zero(int[][] mat)
	{
		boolean rs=false;
		for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
            	if(rs==false)
                if(mat[i][j]==0)
                {
                	int f = i+1;
                	int f2=i-1;
                    int l = j+1;
                    int l2=j-1;
                    while(f<mat.length)
                    {
                        mat[f][j]=0;
                        f++;
                    }
                    while(f2>=0)
                    {
                        mat[f2][j]=0;
                        f2--;
                    }
                    while(l<mat[0].length)
                    {
                        mat[i][l]=0;
                        l++;
                    }
                    while(l2>=0)
                    {
                        mat[i][l2]=0;
                        l2--;
                    }
                    rs=true;
                }
               
            }
          
        }
	}

	public static void main(String[] args) {
		int[][] mat = {{1,1,1},{1,0,1},{1,1,1}};
		zero(mat);
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}

	}

}
