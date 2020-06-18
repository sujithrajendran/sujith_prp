
public class Array8{
	public static void main(String[] args) 
	{ 
		int lis[] = {10,3,6,1,2,7,9}; 
		int a = 6; 
		int b = 7; 
		int sum = 0; 
		boolean add = true; 
		for (int i = 0; i < lis.length; i++) 
		{
			if (lis[i] != a && add == true) 
				sum = sum + lis[i];
			else if (lis[i] == a) 
				add = false; 
			else if( lis[i] == b) 
				add = true; 
		} 
		System.out.print(sum); 
	} 
}
	