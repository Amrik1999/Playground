#include<stdio.h>
#include<stdlib.h>
int main()
{
    int i,l,j,k,rows,count;
    scanf("%d",&rows);
    count=rows;
    for(i=1;i<=rows;i++)
    {
        for(k=1;k<count;k++)
        {
            printf(" ");
        }
        for(j=1;j<=i;j++)
        {
            printf("*");
        }
        count--;
        printf("\n");
    }
    count=1;
    for(l=rows-1;l>=1;l--)
    {
         for(k=1;k<=count;k++)
        {
            printf(" ");
        }
        for(j=1;j<=l;j++)
        {
            printf("*");
        }
        count++;
        printf("\n");
    }
    
}

