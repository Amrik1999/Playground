#include <stdio.h>
int main()
{
  int rem,sum,num,a[100],n,i;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
for(i=0;i<n;i++)
{
  sum=0;
  num=a[i];
  while(num!=0)
  {
    rem=num%10;
    sum+=rem;
    num=num/10;
  }
  a[i]=sum;
}
  
  for(i=0;i<n;i++)
    printf("%d ",a[i]);
   return 0;
}