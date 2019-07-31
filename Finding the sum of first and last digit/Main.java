#include <stdio.h>
int main() {
  int n,t,sum=0,r,x,y,z,c,b,m;
    scanf("%d",&n);
  t=n;
  while(t!=0){
    r = t%10;
  sum = sum+1;
    t= t/10;
  }
if (sum == 5)
{
  x = n/10000;
  y = n%10;
  z = x+y;
  printf("%d",z);
}
  else if(sum == 4)
  {
    c = n/1000;
    b = n%10;
    m = c+b;
    printf("%d",m);
  }
  
	//Type your code
	return 0;
}