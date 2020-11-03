#include<stdio.h>
int dec_to_bin(int n)
{
  int rem=0,power=1,dec=0;
   while(n!=0)
   {
     rem=n%2;
     dec=dec+rem*power;
     power=power*10;
     n=n/2;
   }
  return dec;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_bin(n));
}
