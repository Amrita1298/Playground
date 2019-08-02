#include<stdio.h>
int main()
{
  int n,c,d,sum;
  scanf("%d",&n);
  c=n/10;
  d=n%10;
  sum=c+d;
  printf("%d",sum);
  return 0;
}