import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int a = in.nextInt();
      int b=0;
      int c;
      int t;
      t=a;
      
      while(t>0)
      {
        c=t%10; 
        b=b+c;
        t=t/10;
      }
      System.out.println(b);
	}
}