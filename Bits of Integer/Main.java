#include<stdio.h>
#include<math.h>
int dec_to_bin(int n)
{
  int i=0;
   while(1)
   {
     if(pow(2,i)>=n)
     {
       return i;
       break;
     }
     i++;
   }
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_bin(n));
}
