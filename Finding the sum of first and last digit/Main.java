#include <stdio.h>
int main() {
	//Type your code
  int a,f,l;;
  scanf("%d",&a);
  l=a%10;
  while(a>9)
  {
    a=a/10;
  }
  f=a;
  printf("%d",f+l);
	return 0;
}