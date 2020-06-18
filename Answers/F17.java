public class Flow17 {

	public static void main(String[] args) {
		int rem,res=0;
		int num=Integer.parseInt(args[0]);
		int temp=num;
		while(num !=0)
		{
			rem=num%10;
			res=res*10+rem;
			num=num/10;
		}
		if(temp==res){
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not");
		}
	}

}

