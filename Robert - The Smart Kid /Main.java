//Sum of N numbers
#include<iostream>
using namespace std;
int main()
{
  //Type your code here
  long long int a;
  cin>>a;
  if(a>0)
    cout<<(a*(a+1))/2;
  else
    cout<<"0";
  return 0;
}