import java.util.Scanner;
class Main
{
  	public static int sqr(int n)
    {
      int a;
      a=n*n;
      return a;
    }
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a;
      a=sqr(n);
      System.out.print(a);
      
	} 
}