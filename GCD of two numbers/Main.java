#include<stdio.h>
int gcd(int a,int b)
{
  int g;
   if(a<b)
   {
     a=a+b;
     b=a-b;
     a=a-b;
   }
  if(a%b==0)
  {
    return b;
  }
  else
  {
    g=gcd(b,a%b);
  }
  return g;
}
int main()
{
    int a,b;
    scanf("%d %d",&a,&b);
    printf("%d ",gcd(a,b));
    return 0;
}
