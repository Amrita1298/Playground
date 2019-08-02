#include<stdio.h>
int main()
{
 int num,c,d,sum;
  scanf("%d",&num);
  c=num/100;
  d=num%10;
  sum=c+d;
  printf("%d",sum);
  return 0;
}