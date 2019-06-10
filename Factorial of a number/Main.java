#include <stdio.h>
int main() {
	//Type your code
  int n,a;
  scanf("%d",&n);
  a=fact(n);
  printf("%d",a);
	return 0;
}
int fact(int n){
if(n==1)
{
  return 1;
}
  else
  {
    return n*fact(n-1);
  }
}