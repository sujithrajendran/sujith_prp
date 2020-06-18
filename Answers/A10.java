class Array10
{
	public static void main (String[] args) throws java.lang.Exception
	{
       int a[]={1,0,1,0,0,1,1};
       int n=a.length;
        int j=-1,temp;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                j++;
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
              
            }
        }
          for(int i=0;i<n;i++){
           System.out.print(a[i]+" ");
        }


	}
}