#include <stdio.h>
int main()
{
  int t,n,i,j,a[100],flag;
   scanf("%d",&t);
  while(t)
  {
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
      scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
      flag=0;
      for(j=i;j<n;j++)
      {
        if(a[i]<a[j])
        {
          flag=0;
          break;
        }
        else
          flag=1;
      }
      if(flag==1)
      {
        printf("%d ",a[i]);
      }
    }
    printf("\n");
    t--;
  }
   return 0;
}