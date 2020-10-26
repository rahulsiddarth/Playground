#include<stdio.h>
#include<stdlib.h>
struct node{
  int data;
  struct node *next;
};
int main()
{
  int val1,val2;
  struct node *head, *ptr, *newnode,*newnode2,*ptr2;
  head=(struct node*)malloc(sizeof(struct node));
  head->data=NULL;
  scanf("%d",&val1);
  for(int i=0;i<val1;i++){
    scanf("%d",&val2);
    newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=val2;
    newnode->next=NULL;
    if(i==0){
      head->next=newnode;
      ptr=newnode;
    }
    else{
      ptr->next=newnode;
      ptr=ptr->next;
  }
  }
  /*while(head!=NULL){
    printf("%d ",head->data);
    head=head->next;
  }*/
  scanf("%d",&val1);
  scanf("%d",&val2);
  ptr=head;
  while(ptr!=NULL){
    if((ptr->next)->data==val1){
        newnode=ptr;
    }
    if((ptr->next)->data==val2){
        newnode2=ptr;
        break;
    }
    ptr=ptr->next;
  }
  ptr=(newnode->next);
  ptr2=(newnode2->next);
  newnode->next=ptr2;
  newnode2->next=ptr;
  newnode=ptr->next;
  newnode2=ptr2->next;
  ptr->next=newnode2;
  ptr2->next=newnode;
  head=head->next;
  while(head!=NULL){
    printf("%d ",head->data);
    head=head->next;
  }
  return 0;
}