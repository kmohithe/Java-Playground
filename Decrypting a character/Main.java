import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      char ch=in.next().charAt(0);
      int k=in.nextInt();
      if(ch>='a'&&ch<='z')
      {
        ch=(char) (ch-k);
        if(ch<'a')
        {
          ch=(char)(ch+26);
        }
       
        System.out.print(ch);
      }
      if(ch>='A'&&ch<='Z')
      {
        ch=(char) (ch-k);
        System.out.print(ch);
      }
      
    }
}
