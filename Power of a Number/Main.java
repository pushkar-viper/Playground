#include <stdio.h>
int main()
{
  int b,exp,num;
  scanf("%d%d",&b,&exp);
  num = pow(b,exp);
  if (exp>=0)
    printf("%d",num);
  else
    printf("Wrong input");
  	//Your code here       
    return 0;
}