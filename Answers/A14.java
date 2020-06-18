public class Array14 {
	public static void main(String [] args){
		int a[][] = new int[3][3];
		int k=0;
	    for(int i=0;i<a.length;i++)
	    {
	        for(int j=0;j<a.length;j++)
	        {
	        a[i][j]=Integer.parseInt(args[k]);
	        k++;
	        }
	    }
      int max=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                  if(max<a[i][j])
                  {
        	     max=a[i][j];
                  }
                }
        }
        System.out.println(max);
        
	}
}
