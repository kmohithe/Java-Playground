import java.util.Scanner;
class Main{
  public static int great(int m,int n,int o)
  {
    if(m>n)
    {
      if(m>o)
      {
        return m;
      }
      else
      {
        return o;
      }
    }
    else if(n>o)
    {
      return n;
      
    }
    else
    {
      return o;
    }
  }
      
      
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int m=in.nextInt();
      int n=in.nextInt();
	  int o=in.nextInt();
      int l=great(m,n,o);
      System.out.print(l);
    }
}