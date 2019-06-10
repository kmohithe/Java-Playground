import java.util.Scanner;
public class Main{
  public static int gcd(int m,int n)
  {
    int a=0;
    int min;
    if(m>n)
    {
      min=n;
    }
    else
    {
      min=m;
    }
    while(min>=0)
    {
      if(m%min==0&&n%min==0)
      {
        a=min;
        break;
      }
      else
      {
        min--;
      }
    }
    return a;
  }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int m=in.nextInt();
      int n=in.nextInt();
      int o=in.nextInt();
      int l=gcd(m,n);
      int p=gcd(l,o);
      System.out.print(p);
      
	}
}