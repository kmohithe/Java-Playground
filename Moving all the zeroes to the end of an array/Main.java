import java.util.Scanner;
class Main{
  public static void mz(int n,int a[])
  {
    int b[]=new int[n];
    int z=0,d=0,k=0,j=0;
    for(int i=0;i<n;i++)
    {
      if(a[i]==0)
      {
        z++;
      }
    }
    d=n-z;
   
    for(int i=0;i<n;i++)
    {
        
      if(a[i]!=0)
      {
        
        b[j]=a[i];
        j++;
      }
    
    }
    for(int i=d;i<n;i++)
    {
        b[i]=0;
    }
    
    for(int i=0;i<n;i++)
    {
      System.out.print(b[i]+" ");
    }
  }
    
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      mz(n,a);
    }
}