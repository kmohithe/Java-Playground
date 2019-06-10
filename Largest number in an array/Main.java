import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
  int asize=in.nextInt();
  int a=0,max;
  
  int arr[]=new int[asize];
  for(int i=0;i<=asize-1;i++)
  {
    arr[i]=in.nextInt();
  }
      max=arr[0];
      for(int i=1;i<=asize-1;i++)
      {
        if(max<arr[i])
        {
          max=arr[i];
        }
      }
      System.out.print(max);
       
          
        }
    
}