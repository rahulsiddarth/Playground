#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int arr[50],max=0,n;
  cin>>n;
  for(int i=0;i<n;i++){
    cin>>arr[i];
    if(arr[i]>max)
    {
      max=arr[i];}
  }
  cout<<max;
  return 0;
}
