import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int a=in.nextInt();
      if(a>=85)
      {
        System.out.println("A");
      }
      else if(a<85&a>=75)
      {
        System.out.println("B");
      }
      else if(a<75&a>=65)
      {
        System.out.println("C");
      }
      else if(a<65&a>=55)
      {
        System.out.println("D");
      }
      else if(a<55&a>=45)
      {
        System.out.println("E");
      }
      else
      {
        System.out.println("Fail");
      }
      
    }
}