#include <stdio.h>
int main() {
  int n,t,sum=0,r,e,x,y;
    scanf("%d",&n);
  t=n;
  while(t!=0){
    r = t%10;
  sum = sum+1;
    t= t/10;
  }
  if (sum==5){
   e= n/1000;
    x= e%10;
    printf("%d",x);
  }
  else if(sum == 2)
  {
    y=n%10;
    printf("%d",y);
  }
  
	//Type your code
	return 0;
}