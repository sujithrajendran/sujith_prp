public class A2{

	public static void main(String [] args){
		int arr[]={1,2,3,4,5};
		int min=1000,max=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min)
			{
				min=arr[i];
			}
			else if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println(min+" "+max);
		
	}
}
