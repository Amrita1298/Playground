#include <stdio.h>
#include <math.h>
int main() {
	int i,n,rem,s=0,t,j=0;
  scanf("%d",&n);
  t=n;
  while(n!=0)
  {
    n/=10;
    j++;
  }
  n=t;
  //j=j+1;
    
  
  for(i=1;i<=j;i++)
  {
    rem=n%10;
    s=s+pow(rem,j);
    n=n/10;
  }
  if(s==t)
   printf("Armstrong Number");
 
  else

    printf("Not an Armstrong Number");
  
  
	return 0;
}