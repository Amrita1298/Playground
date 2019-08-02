// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  int a,b,n;
  scanf("%d%d",&a,&b);
  if(a>b)
    n=b;
  else
    n=a;
  int i=0;
  for(i=n;i<=n;i--)
  {
    if((a%i==0)&&(b%i==0))
    {
      printf("%d",i);
      return 0;
    }
  }
  
  
   return 0;
}