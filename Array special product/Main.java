#include<iostream>
using namespace std;
void print(int arr[],int n,int prod)
{
  for(int i=0;i<n;i++){
    cout<<prod/arr[i]<<endl;
  }
}
int main()
{
  int n;
  cin>>n;
  int arr[n],prod=1;
  for(int i=0;i<n;i++){
    cin>>arr[i];
    prod = prod*arr[i];
  }
  print(arr,n,prod);
  return 0;
}