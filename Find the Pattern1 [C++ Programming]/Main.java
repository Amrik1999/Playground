#include <iostream>
using namespace std;
int pattern(int n)
{
   //Your code goes here
  int i,j;
  for(i=1;i<=n;i++)
  {
    if(i==1 || i==n)
    {
    for(j=1;j<=n;j++)
    {
      printf("1");
    }
    }
    else
    {
      for(j=1;j<=n;j++)
      {
        if(j==1 || j==n)
        {
          printf("1");
        }
        else
          printf(" ");
      }
    }
      printf("\n");
}
}
int main()
{
    int n;
    cin>>n;
    pattern(n);
}
