#include<iostream>
using namespace std;
void sum(int n){
  int summ=0;
  if(n<=9){
    cout<<n;}
  else{
    while(n!=0){
      summ=summ+(n%10);
      n=n/10;}
    sum(summ);
  }
}
int main()
{
  int n;
  cin>>n;
  sum(n);
  //Type your code here
}