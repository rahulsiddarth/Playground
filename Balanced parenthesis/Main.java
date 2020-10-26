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
  head=head->next;
}

int main()
{
  int flag=0;
  string s;
  cin>>s;
  if(s.length()%2!=0){
  cout<<"Not Balanced";
    exit(0);
  }
  for(int i=0;i<s.length();i++){
  if(s[i]=='{' || s[i]=='(' || s[i]=='['){
    push(s[i]); 
  }
  else if(s[i]=='}'){
  if(head->data!='{'){
    cout<<"Not Balanced";
    flag=1;
    break;
  }
    else{
    pop();
    }
   }
   else if(s[i]==')'){
  if(head->data!='('){
    cout<<"Not Balanced";
    flag=1;
    break;
  }
    else{
    pop();
    }
   } 
    else if(s[i]==']'){
  if(head->data!='['){
    cout<<"Not Balanced";
    flag=1;
    break;
  }
    else{
    pop();
    }
   } 
   }
  if(flag==0){
  cout<<"Balanced";
  }
  return 0;
}