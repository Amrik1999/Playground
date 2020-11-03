#include<stdio.h>
#include<math.h>
int bin_to_dec(int n)
{
  int rem=0,sum=0,count=0;
    while(n!=0)
    {
      rem=n%10;
      sum=sum+rem*pow(2,count);
      n=n/10;
      count++;
    }
  return sum;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",bin_to_dec(n));
}