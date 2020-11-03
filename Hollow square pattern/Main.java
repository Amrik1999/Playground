#include<stdio.h>
int main()
{
  int i,j,n;
  scanf("%d",&n);
  for(i=1;i<=n;i++,printf("\n"))
  {
      if(i==1 || i==n)
      {
        for(j=1;j<=n;j++)
          printf("* ");
      }
    else
    {
      for(j=1;j<=2*n-1;j++)
      {
        if(j==1 || j==2*n-1)
          printf("*");
        else
          printf(" ");
      }
    }
    }
  return 0;
}