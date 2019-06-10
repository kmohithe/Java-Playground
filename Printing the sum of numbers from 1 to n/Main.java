#include <stdio.h>
int main() {
	//Type your code
  int a;
  scanf("%d",&a);
  int sum=0;
  for(int i=1;i<=a;i++)
  {
    sum=sum+i;
    
  }
  printf("%d",sum);
	return 0;
}