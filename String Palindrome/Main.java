import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      String s="";
       
        int n = str.length();
      
     
     for(int i = n - 1; i >= 0; i--)
        {
            s = s + str.charAt(i);
        }
     
              

      if(str.equals(s)==true)
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
          
      
    } 
}