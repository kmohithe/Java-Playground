import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
  int n =in.nextInt();
  int a[]=new int[n];
    int max=0,c=0;;
  for(int i=0;i<n;i++)
  {
    a[i]=in.nextInt();
   
  }
    for(int i=0;i<n;i++)
    {
      if(a[i]>max)
      {
        max=a[i];
        c=i;
      }
    }
    
       System.out.print(c);
   
  
  }
}