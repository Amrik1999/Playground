#include<stdio.h>
#include<string.h>
int main()
{
  int i=0,j;
  char s[200];
  char word[200][100];
   gets(s);
  char delim[]=" ";
  char *ptr=strtok(s,delim);
  while(ptr!=NULL)
  {
    strcpy(word[i],ptr);
    i++;
	ptr=strtok(NULL,delim);
  }
  for(j=i-1;j>=0;j--)
  {
    printf("%s ",word[j]);
  }
  return 0;
}