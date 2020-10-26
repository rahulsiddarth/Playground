//Fibonacci Series
#include<iostream>
using namespace std;
void fibo(int n)
{
  long long arr[50];
  arr[0]=0;
  arr[1]=1;
  for(int i=2;i<n;i++)
  {
    arr[i]=arr[i-1]+arr[i-2];
  }
  cout<<arr[n-1];
}
int main()
{
  //Type your code here
  int n;
  cin>>n;
  fibo(n);
  return 0;
}