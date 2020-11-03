#include <stdio.h>
#include<string.h>
int main()
{
  char s[100],freq[26]={};
  int i,j,l;
  gets(s);
  l=strlen(s);
  for(i=0;i<l;i++)
  {
    freq[s[i]-'a']++;
  }
  for(i=0;i<26;i++)
  {
    if(freq[i]!=0)
      printf("%c%d",i+'a',freq[i]);
  }
  return 0;
}