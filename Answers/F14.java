public class Flow14 {

	public static void main(String [] args){
		int n,sum;
		int n=Integer.parseInt(args[0]);
		for(sum=0 ;n!=0 ;n/=10)
		{
		sum+=n%10;
		}
		System.out.println(sum);
           }	
}

