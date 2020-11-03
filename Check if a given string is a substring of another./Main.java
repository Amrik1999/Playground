#include <stdio.h>
#include<string.h>
int main()
{
  char s1[100],s2[100];
  int t,i,j,n,flag,l1,l2,a;
   scanf("%d",&t);
  while(t)
  {
    
    scanf("%s %s",&s1,&s2);
    /*l1=strlen(s1);
    l2=strlen(s2);
    for(i=0;i<l1-l2;i++)
    {
      flag=0;
      for(j=0;j<l2;j++)
      {
        if(s1[i+j]!=s2[j])
        {
          flag=1;
          break;
        }
      }
    }
    if(flag==0)
      printf("YES\n");
    else
      printf("NO\n");
      */
    a=strstr(s1,s2);
    if(a)
      printf("Yes\n");
    else
      printf("No\n");
    --t;
  }
}