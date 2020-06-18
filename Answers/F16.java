public class F16 {

	public static void main(String [] args){
		int rem,res=0;
	        int num=Integer.parseInt(args[0]);
		while(num !=0)
		{
			rem=num%10;
			res=res*10+rem;
			num=num/10;
		}
          System.out.println(res);
           }	
}