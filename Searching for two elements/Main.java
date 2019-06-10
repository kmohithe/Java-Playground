import java.util.*;
class Main
{
public static void main(String args[])
{
//Try out your code here
  Scanner in=new Scanner(System.in);
  int asize=in.nextInt();
  int found1=0,found2=0,a=0,b=0;
  
  int arr[]=new int[asize];
  for(int i=0;i<=asize-1;i++)
  {
    arr[i]=in.nextInt();
  }
  int n=in.nextInt();
  int m=in.nextInt();
 for(int i=0;i<=asize-1;i++)
  {
    if(arr[i]==n)
    {
      found1=1;
      a=i;
      break;
    }
    
  }
  if(found1==1)
  {
    System.out.println(a);
  }
  else
  {
    System.out.print("-1");
  }
    for(int i=0;i<=asize-1;i++)
  {
    if(arr[i]==m)
    {
      found2=1;
      b=i;
      break;
    }
    
  }
  if(found2==1)
  {
    System.out.print(b);
  }
  else
  {
    System.out.println("-1");
  }
  
}
}
