#include<stdio.h>

int main()
{
	
	float cen, fah;
	scanf("%f",&cen);
	fah=(1.8 * cen) + 32;
	printf("%.2f",fah);
	return 0;
}