import java.util.Scanner;
class Main{
  public static int pow(int n,int m)
  {
    int a=1;
    for(int i=1;i<=m;i++)
    {
      a=a*n;
    }
    return a;
  }
      
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int m=in.nextInt();
      int b=pow(n,m);
      System.out.print(b);
	}
}