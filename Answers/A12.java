
public class Array12 {

	public static void main(String[] args) {
		int a[][]={{1,2,3},{4,5,6}};
		//int b[][]={{7,7,7},{3,8,0}};
		int ele[][]= new int[2][2];
		int arr[]=new int[2];
		for(int i=0;i<2;i++)
		{
			for(int j=1;j<2;j++){
			ele[i][j]=a[i][j];
			}
	     }
		for(int i=0;i<2;i++)
		{
			for(int j=1;j<2;j++)
			{
			System.out.println(ele[i][j]);
			}
	     }
	}
}
