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
  
int diameter(struct node*root) {
    if(root==NULL){
    return 0;
    }
       int lDepth = diameter(root->left)+1; 
       int rDepth = diameter(root->right)+1;
       if (lDepth > rDepth)  
           return(lDepth); 
       else return(rDepth); 
}
int main()
{
  int i;
  cin>>i;
  while(i>0){
    insert(i);
    cin>>i;
  }
  cout<<"Height of the tree is "<<diameter(head);
  return 0;
}