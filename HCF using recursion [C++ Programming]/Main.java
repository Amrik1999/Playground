#include <iostream>
using namespace std;

int hcf(int n1, int n2);

int main()
{
   int n1, n2;
   cin >> n1 >> n2;
   cout <<hcf(n1, n2);
   return 0;
}

int hcf(int n1, int n2)
{
   //Type your code here
  int g=0;
  if(n1<n2)
  {
    n1=n1+n2;
    n2=n1-n2;
    n1=n1-n2;
  }
  if(n1%n2==0)
    return n2;
  else
  {
    g=hcf(n2,n1%n2);
  }
  return g;
}