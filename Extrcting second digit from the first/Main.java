#include <stdio.h>
int main() {
	int n,temp;
  scanf("%d",&n);
  while(n>=100)
    
  { n=n/10;
  }
  temp=n%10;
  printf("%d",temp);
	return 0;
}