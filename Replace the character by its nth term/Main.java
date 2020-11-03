#include <stdio.h>
int main()
{
  char s[100];
  int n,i;
   gets(s);
  scanf("%d",&n);
  for(i=0;s[i]!='\0';i++)
  {
    s[i]=s[n-1];
  }
  printf("%s",s);
}