
public class Array13 {

    public static void main(String args[])
    {
    int a=args.length;
    int arr[][] = new int[2][2];
    if(a<4)
    {
    System.out.println("Please enter 4 integer numbers");
    }
    if(a==4)
       {
        int k=0;
    for(int i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
        arr[i][j]=Integer.parseInt(args[k]);
        k++;
        }
        
    }
    for(int i=1;i>=0;i--)
    {
        for(int j=1;j>=0;j--)
        {
        System.out.print(arr[i][j]+" ");
        }
        System.out.println();
        
        }
     }  
 }
}