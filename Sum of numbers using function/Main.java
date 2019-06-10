import java.util.Scanner;
class Main
{
  	public static int sum(int n)
    {
      int a;
      a=(n*(n+1))/2;
      return a;
    }
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
     
      int a;
      a=sum(n);
      System.out.print(a);
      
	} 
}