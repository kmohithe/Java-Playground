import java.util.Scanner;
class Main{
  public static void prim(int n)
  {

    for(int i=1;i<=n;i++)
    {
      int c=0;
      for(int j=1;j<=i;j++)
      {
        if(i%j==0)
        {
          c=c+1;
        }
        
        
        
    }
      if(c==2)
        {
          System.out.println(i);
        }
      
    }
  }
    
  
      
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      
 
        prim(n);
      
	}
}