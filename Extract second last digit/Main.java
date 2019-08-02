#include<stdio.h>
int main()
{
  int num,c,d,e;
  scanf("%d",&num); 
  c=num/1000;
  d=num%100;
  e=d/10;
  printf("%d",e);
  
  return 0;
}