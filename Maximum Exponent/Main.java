#include <stdio.h>
int MaxExponents(int,int);
int find(int);
int main()
{
  int a,b;
  scanf("%d %d",&a,&b);
  printf("%d",MaxExponents(a,b));
  return 0;
}
  
int MaxExponents(int a , int b)
{
int i,I,j=0,max,arr[100],arr2[100];
  for(i=a;i<=b;i++)
  {
    arr2[j]=i;
    arr[j]=find(i);
    j++;
  }
  max=arr[0];
  for(i=0;i<j;i++)
  {
    if(max<arr[i])
      max=arr[i];
  }
 for(i=0;i<j;i++)
 {
   if(arr[i]==max)
   {
     I=i;
     break;
   }
 }
  return arr2[I];
}

int find(int n)
{
  int count=0;
  while(n!=1)
  {
    if(n%2==0)
    {
      count++;
      n=n/2;
    }
    else
      break;
  }
  return count;
}