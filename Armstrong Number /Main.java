#include <stdio.h>
#include <math.h>
int main(){
  int n,t,sum = 0,r,result = 0;
  scanf("%d",&n);
  t=n;
  while(t!=0){
    t = t/10;
    sum = sum + 1;
  }
  t=n;
  while(t!=0){
    r = t%10;
    result  += pow(r,sum);
    t = t/10;
  }
  if (result == n)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
    
	
	return 0;
}