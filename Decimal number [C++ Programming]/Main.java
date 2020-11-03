#include<iostream>
using namespace std;
int dec_to_oct(int n)
{
    //Your code goes here
  int oct=0,rem=0,b=1;
  while(n!=0)
  {
    rem=n%8;
    oct=oct+rem*b;
    b=b*10;
    n=n/8;
  }
  return oct;

}
int main()
{
    int n;
    cin>>n;
    cout<<dec_to_oct(n);
}
