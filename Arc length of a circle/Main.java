#include<stdio.h>
int main()
{
  float r,q,l,pi = 3.14;
  scanf("%f%f",&r,&q);
  l = (2*pi*r*q)/360;
  printf("%.2f",l);
  
  return 0;
}