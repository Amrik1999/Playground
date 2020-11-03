#include<bits/stdc++.h>
using namespace std;

int main(){  
    int n, i, count = 0;
    cin>>n;
    for(i = 2; i < n; i++)
    {
        if(n%i == 0)
        {
            count = 1; 
          break;
        }
    }
       if(count  ==  0)
       {
     	cout<<n<<" is Prime\n";
       }
      else{
      	cout<<n<<" is Not Prime\n";
      } 
} 
    	

