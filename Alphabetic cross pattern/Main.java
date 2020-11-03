#include <stdio.h>
#include<string.h>
int main()
{
  char s[100];
  int l,i,j;
   scanf("%s",s);
  l=strlen(s);
  for(i=0;i<l;i++,printf("\n"))
  {
    for(j=0;j<l;j++)
    {
      if(i==j || l-j-1==i)
        printf("%c",s[j]);
      else
        printf(" ");
    }
  }
   return 0;
}