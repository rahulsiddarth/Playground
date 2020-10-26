#include<iostream>
using namespace std;
int summ(int a)
{
  if(a<=9)
    return a;
  else{
    int s=0;
    while(a!=0)
    {
      s=s+(a%10);
      a=a/10;
    }
    summ(s);}
}
int main(){
  int n;
  cin>>n;
  cout<<summ(n);
  return 0;
}