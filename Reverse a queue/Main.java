#include<bits/stdc++.h>
using namespace std;
queue <int> q;
void display(){
if(q.empty()){
  cout<<"\nAfter reversing:"<<endl;
return;
}
  int i=q.front();
  cout<<i<<" ";
  q.pop();
  display();
  cout<<i<<" ";
}
int main()
{
  int n=-1;
  do{
  cin>>n;
    if(n>0){
    q.push(n);
    }
  }while(n>0);
  if(q.empty()){
  cout<<"Queue is empty";
  }else{
  cout<<"Before reversing:"<<endl;
  display();}
  return 0;
}