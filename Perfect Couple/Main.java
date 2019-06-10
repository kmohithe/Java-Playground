import java.util.*;
class Main
{
  public static void se(int n,int a[],int v)
  {
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if((a[i]+a[j])==v)
        {
          System.out.print(a[i]+", "+ a[j]);
          System.out.println();
        }
      }
    }
  }
   public static void main (String[] args)
   {
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int a[]=new int[n];
     for(int i=0;i<=n-1;i++)
     {
       a[i]=in.nextInt();
     }
    int v=in.nextInt();
     se(n,a,v);
  }
     
    
       
     
     
      
  
    
   
}