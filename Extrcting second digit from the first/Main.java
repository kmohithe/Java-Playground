#include <stdio.h>
int main() {
	//Type your code
  int a,b;
  scanf("%d",&a);
  while(a>100)
  {
    a=a/10;
  }
  b=a%10;
  printf("%d",b);
	return 0;
}