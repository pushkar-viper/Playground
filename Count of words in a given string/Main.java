#include<stdio.h>
#include<string.h>

int main()
{
  char a[100];
  int len,count=0,i;
  gets(a);
  len=strlen(a);
  for(i=0; i<len;i++)
  {
    if (a[i]== ' ')
      count=count+1;
  }
  printf("%d",count+1);
  //Type your code here
  
}