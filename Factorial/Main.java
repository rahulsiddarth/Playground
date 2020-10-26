#include<iostream>
using namespace std;
int fact(int n)
{
  if(n==1)
    return 1;
  else
    return n*fact(n-1);
}
int main()
{
  //Type your code here.
  int a;
  cin>>a;
  cout<<"The factorial of "<<a<<" is "<<fact(a);
  return 0;
}