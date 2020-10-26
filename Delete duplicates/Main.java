#include <stdio.h>
#include <stdlib.h>
struct node{
  int data;
  struct node *prev,*next;
};
int main()
{
  int temp,s,flag=0;
  struct node *head,*newnode,*ptr,*sptr;
  head=(struct node*)malloc(sizeof(struct node));
  head->data=NULL;
  do{
    scanf("%d",&temp);
    if(temp>0){
      flag=1;
      newnode=(struct node*)malloc(sizeof(struct node));
      newnode->data=temp;
      newnode->next=NULL;
      newnode->prev=NULL;
      if(head->data==NULL){
        head=newnode;
        ptr=head;
      }
      else{
        ptr->next=newnode;
        newnode->prev=ptr;
        ptr=ptr->next;
        }
       }
  }while(temp>0);
  if(flag==0){
    printf("Linked list before removal of duplicates\n");
    printf("Linked list after removal of duplicates\n");
    exit(0);
  }
  newnode=(struct node*)malloc(sizeof(struct node));
  newnode->data=NULL;
  newnode->next=NULL;
  newnode->prev=ptr;
  ptr->next=newnode;
  printf("Linked list before removal of duplicates\n");
  ptr=head;
  while(ptr->next!=NULL){
      printf("%d\n",ptr->data);
      ptr=ptr->next;
  }
   printf("Linked list after removal of duplicates\n");
   sptr=head;
   while(sptr->next!=NULL){
    s=sptr->data;
    ptr=sptr->next;
    while(ptr!=NULL){
        if(ptr->data==s){
            ptr=ptr->prev;
            ptr->next=(ptr->next)->next;
            (ptr->next)->prev=ptr;
        }
    ptr=ptr->next;
    }
    sptr=sptr->next;
   }
  ptr=head;
  while(ptr->next!=NULL){
      printf("%d\n",ptr->data);
      ptr=ptr->next;
  }
   return 0;
}