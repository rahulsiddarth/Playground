#include <iostream>
#include <string>
using namespace std;
struct node{
  char data;
  struct node* next;
}*head=NULL;

void push(char c){
  struct node *newnode= new node();
  newnode->data=c;
  newnode->next=NULL;
  if(head==NULL){
  head=newnode;
  }
  else{
    newnode->next=head;
    head=newnode;
  }
  //cout<<head->data;
}
char pop(){
struct node *temp=head;
  head=head->next;
  char c =temp->data;
  delete(temp);
  //cout<<c;
  return c;
}
void display(){
}
int main()
{
    string s;
    int flag=0;
    cin>>s;
    for(int i=0;i<s.length();i++){//(a+b*(c-d))
    if(s[i]!=')'){
    push(s[i]);
    }
    else{
    char r=pop();
    int f=0;
    while(r!='('){
            if(r=='+' || r=='-' || r=='*' || r=='/'){
            f=1;
          }
            r=pop();
        }
        if(f==0){
        flag=1;
        cout<<"Yes";break;}
    }
    }
  if(flag==0){
    cout<<"No";}
    return 0;
}