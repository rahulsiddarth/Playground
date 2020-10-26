#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int arr[n],arr1[n];
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  arr1[0]=arr[0];
  arr1[1]=max(arr[0],arr[1]);
  for(int i=2;i<n;i++){
    arr1[i]=max(arr1[i-1],arr[i]+arr1[i-2]);
  }
  cout<<arr1[n-1];
  return 0;
  }