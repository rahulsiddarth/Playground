#include<bits/stdc++.h>
using namespace std;
struct node{
int data;
struct node *left,*right;
}*head=NULL;
void insert(int i){
  struct node *newnode=new node();
  newnode->data=i;
  newnode->left=NULL;
  newnode->right=NULL;
  if(head==NULL){
  head=newnode;
  }
  else {
    struct node *root=head;
    while(1){
        if(i>root->data){
            if(root->right==NULL){
                root->right=newnode;
                return;
                }
                root=root->right;
        }
        else{
            if(root->left==NULL){
                root->left=newnode;
                return;
                }
                root=root->left;
        }
    }
  }
}
void find(){
int resultSum=0;
if(head!=NULL){
queue <struct node*> s;
s.push(head);
while(!s.empty()){
    struct node *top=s.front();
    if(top->right==NULL && top->left==NULL){
        resultSum += (top->data);
    }
    else{
            if(top->right){
                s.push(top->right);
            }
            if(top->left){
                s.push(top->left);
            }
    }
    s.pop();
}}
cout<<"Sum of all leaf nodes are "<<resultSum;
}
int main()
{
  int i;
  cin>>i;
  while(i>0){
    insert(i);
    cin>>i;
  }
  find();
  return 0;
}