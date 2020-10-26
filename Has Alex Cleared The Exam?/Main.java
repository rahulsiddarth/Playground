#include<iostream>
using namespace std;
int main()
{
  int arr[100],n,c=0,num;
  cin>>n;
  for(int i=0;i<n;i++){
    cin>>arr[i];
  }
  cin>>num;
  for(int i=0;i<n;i++){
    if(arr[i]==num){
      cout<<"She passed her exam";c=1;break;}
   }
  if(c==0)
    cout<<"She failed";
  return 0;    
}