#include<iostream>
using namespace std;

int binary(int arr[],int low,int high,int s)
{
  if(low<=high){
  	int mid=(low+high)/2;
    if(arr[mid]==s)
      return mid;
    else if(s<arr[mid]){
      high=mid-1;
      binary(arr,low,high,s);
    }
    else if(s>arr[mid]){
      low=mid+1;
      binary(arr,low,high,s);
  }
}
  else
    return -1;
}
int main()
{
  int n,s;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++){
    cin>>arr[i];
  }
  cin>>s;
  s=binary(arr,0,n-1,s);
  if(s+1)
    cout<<s;
  else
    cout<<"Not found";
  return 0;
}