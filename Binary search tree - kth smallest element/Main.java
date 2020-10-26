#include<bits/stdc++.h>
using namespace std;
stack <int> q;
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
  
void inOrder(struct node*root,int k) {
    if(root==NULL){
        return;
    }
    inOrder(root->left,k);
    q.push(root->data);
    if(q.size()==k){
      cout<<q.top();
      return;}
    inOrder(root->right,k);
}
int main()
{
  int i;
  cin>>i;
  while(i>0){
    insert(i);
    cin>>i;
  }
  cout<<"Enter the kth value:"<<endl;
  cin>>i;
  cout<<"Smallest kth value ";
  inOrder(head,i);
  return 0;
}