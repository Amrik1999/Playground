#include <iostream>
using namespace std;

int main()
{
    int n1, n2;
    cin >> n1 >> n2;
    
    while(n1 != n2)
    {
        //Type your code here
      if(n1<n2)
      {
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
      }
      if(n1%n2==0)
      {
        n1=n2;
        break;
      }
      else
      {
        n1=n1%n2;
      }
    }
    cout <<n1;
    return 0;
}