#include <stdio.h>
int main() {
	//Type your code
  int a;
  scanf("%d",&a);
  for(int i=1;i<=a;i++)
  {
    if(i%2!=0)
    {
      printf("%d \n",i);
    }
  }
	return 0;
}