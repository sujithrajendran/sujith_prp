
class Array9
{ 
	static void pushZerosToEnd(int arr[], int n) 
	{ 
		for(int i=0;i<n;i++)
		{
			if(arr[i]==10)
			{
				arr[i]=0;
			}
		}
		int count = 0; 
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) 
			{
				arr[count++] = arr[i]; 
		
			}
	} 
		while (count < n) 
			arr[count++] = 0; 
	}
	public static void main (String[] args) 
	{ 
		int arr[] = {10,2,10}; 
		int n = arr.length; 
		pushZerosToEnd(arr, n);
		for (int i=0; i<n; i++) 
			System.out.print(arr[i]+" "); 
	} 
} 

