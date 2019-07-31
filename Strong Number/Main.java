#include <stdio.h>
int main() {
	int num,x,a,y,b,fac = 1,m = 1,n = 1,add;
      scanf("%d",&num);
  x = num%10;
  a = num/10;
  y = a%10;
  b = y/10;
  for(int i = 1; i<=b; i++)
  {
    fac *= i;
  }
  for (int j = 1; j<= y; j++)
  {
    m *= j;
  }
  for (int k = 1; k<= x; k++)
  {
    n *= k;
  }
  add = fac+m+n;
  if ( add == num)
    printf("Yes");
  else
    printf("No");
  
	return 0;
}