#include <stdio.h>
#include<string.h>
#include<stdlib.h>
int main()
{
  char s1[100],s2[100],c;
  int i,j,l1,l2,flag;
  scanf("%s %s",&s1,&s2);
  l1=strlen(s1);
  l2=strlen(s2);
  if(l1==l2)
  {
    printf("NA");
    exit(0);
  }
  else
  {
    j=0;
    for(i=0;i<l1;i++)
    {
     if(s1[i]==s2[j])
      j++;
     else
      {
        printf("%c",s1[i]);
      }
    }
  }
   return 0;
}