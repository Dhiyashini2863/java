import java.io.*;
import java.lang.*;
class floyd
{
	int inf;
	void input(int vertex,int a[][]) throws Exception
	{
			int i,j,k,c;
		
	
		for(k=0;k<vertex;k++)
		{
			for(i=0;i<vertex;i++)
			{
				for(j=0;j<vertex;j++)
				{
					if(a[i][j]==999&&(a[i][k]!=999&&a[k][j]!=999))
					{
						a[i][j]=a[i][k]+a[k][j];
					}
					else if(a[i][j]!=999 &&a[i][k] !=999&&a[k][j]!=999)
					{
						c=a[i][k]+a[k][j];
						if(c<a[i][j])
							a[i][j]=c;			
					}		
				}
			}
		}
		System.out.println("Shortest path cost:");
		print(a,vertex);
	}
	void print(int matrix[][],int vertex)
	{
		for(int i=0;i<vertex;++i)
		{
			for(int j=0;j<vertex;++j)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
class joyce
{
	public static void main(String ss[])           throws Exception
	{
		int g[][]=new int[50][50];
		int n,inf;
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter the limit:");
		n=Integer.parseInt(d.readLine());
		System.out.println("Enter the adjacency  matrix (enter 999 for infinity):");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println("Edge from vertex"+""+(i+1)+""+"to"+""+(j+1)+":");
				g[i][j]=Integer.parseInt(d.readLine());
			}
		}
		floyd ff=new floyd();
		ff.input(n,g);
	}
}
