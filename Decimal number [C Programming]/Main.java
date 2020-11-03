#include<stdio.h>
int dec_to_oct(int n)
{
  int a[100],rem=0,i=0,j=1,sum=0;
    //Your code goes here
  while(n!=0)
  {
    rem=n%8;
   sum=sum+rem*j;
    j=j*10;
    n=n/8;
    i++;
  }
  return sum;

}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_oct(n));
}
