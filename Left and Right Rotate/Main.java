import java.util.Scanner;
class Main
{
    public static void ra(int n,int a[],int nr)
    {
        int j=0,k=0,l=0,m=0,w,v;
        if(n%2==0)
        {
            w=n/2;
            v=n/2;
            
        }
        else
        {
            w=(n/2)+1;
            v=(n/2);
            
        }
        int o[]=new int[w];
        int e[]=new int[v];
        for(int i=1;i<n;i+=2)
        {
            e[j]=a[i];
            j++;
        }
        for(int i=0;i<n;i+=2)
        {
            o[k]=a[i];
            k++;
        }
        for(int r=1;r<=nr;r++) //LEFT ROTATE
        {
            int temp=e[0];
            for(int i=1;i<=v-1;i++)
            {
                e[i-1]=e[i];
            }
            e[v-1]=temp;
        }
         for(int r=1;r<=nr;r++) //right ROTATE
        {
            int temp=o[w-1];
            for(int i=w-1;i>0;i--)
            {
                o[i]=o[i-1];
            }
            o[0]=temp;
        }
        for(int i=0;i<=n-1;i+=2)
        {
            
            a[i]=o[l];
            if(i+1<n)
            {
             a[i+1]=e[m];
            }
            l++;
            m++;
        }
    }
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		}
		int nr=in.nextInt();
		ra(n,a,nr);
		for(int i=0;i<n;i++)
		{
		    System.out.print(a[i]+" ");
		}
	}
}
