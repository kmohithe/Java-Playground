import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in= new Scanner(System.in);
      int n=in.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int spac=1;spac<=n-i;spac++)
        {
          System.out.print(" ");
        }
          
        for(int j=1;j<=2*i-1;j++)
        {
          System.out.print("*");
        }
         System.out.print("\n");
      }
        
	}
}