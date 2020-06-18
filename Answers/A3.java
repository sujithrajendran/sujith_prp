public class Array3{

	public static void main(String [] args){
	int arr[]={1,4,34,56,7};
	int search=Integer.parseInt(args[0]);
	int count=0,index = 0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==search)
		{
			count++;
			 index=i;
		break;
		}
	}
	if(count==1){
		System.out.println(index);
	}
	else
	{
		System.out.println(-1);
	}
	}
}
