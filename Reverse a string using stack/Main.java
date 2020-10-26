#include<iostream>
#include<string>
using namespace std;
struct node{
char data;
struct node* next;
}*head=NULL;
void push(char c){
 struct node* newnode=new node();
 newnode->data=c;
 newnode->next=NULL;
  if(head==NULL){
  head=newnode;
  }
  else{
  newnode->next=head;
  head=newnode;  
  }
}
void pop(){
  while(head!=NULL){
    cout<<head->data;
  head=head->next;
  }
}

int main()
{
  string s;
  cin>>s;
  for(int i=0;i<s.length();i++){
  push(s[i]);
  }
  pop();
  return 0;
}