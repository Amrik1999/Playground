#include <stdio.h>
int main()
{
   // Try out your code here
    int a,b[15],i=0,t,k,s,h,n=0;
        scanf("%d",&a);
        while(a!=0)  {
                b[i++]=a%10;
                a/=10;
          n++;
        }
        for(s=0;s<n;s++) {
                for(h=s+1;h<n;h++) {
                        if(b[s]>b[h])  {
                                t=b[s];
                                b[s]=b[h];
                                b[h]=t;
                        }
                }
        }
        for(i=0;i<n;i++)
          printf("%d ",b[i]);
   return 0;
}