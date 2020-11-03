#include<stdio.h>
int pattern(int n)
{
   int i,j;
   for(i=0;i<n;i++)
   {
     if(i==0 || i==n-1)
     {
       for(j=0;j<n;j++)
       {
         printf("1");
       }
       printf("\n");
     }
     else
     {
       for(j=0;j<n;j++)
       {
         if(j==0 || j==n-1)
         {
           printf("1");
         }
         else
           printf(" ");
       }
       printf("\n");
     }
       
   }
}
void main()
{
    int n;
    scanf("%d",&n);
    pattern(n);
}
