#include<bits/stdc++.h>
using namespace std;
int main()
{
  stack <int> s;
  s.push(-1);
  int max_len=0;
  string str;
  cin>>str;
  for(int i=0;i<str.length();i++){
   if(str[i]=='('){
   s.push(i);
   }
    else{
    s.pop();
    if(s.empty()){
    s.push(i);
    continue;
    }
      else{
      int cur_len=i-s.top();
        if(max_len<cur_len){
          max_len=cur_len;
        }
      }
    }
  }
cout<<max_len;
  return 0;
}