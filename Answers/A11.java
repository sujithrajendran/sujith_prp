
public class Array11 {

	public static void main(String[] args) {
		int arr[]={1,4,1,4};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1 || arr[i]==4)
			{
				count++;
			}
		}
		if(count==4){
			
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}

}
