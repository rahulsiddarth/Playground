#include <stdio.h>
#include <stdlib.h>
struct node{
  int data;
  struct node *next;
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
      newnode=(struct node*)malloc(sizeof(struct node));
      newnode->data=temp;
      newnode->next=NULL;
      if(head->data==NULL){
        head=newnode;
        ptr=head;
      }
      else{
        flag=0;
        sptr=head;
         while(sptr!=NULL ){
           s=sptr->data;
           if(s==temp){
             flag=1;
             break;}
           sptr=sptr->next;
          }
        if(flag==0){
        //printf("%d\n",temp);
        ptr->next=newnode;
        ptr=ptr->next;
        }
       }
      }
  }while(temp>0);
   if(head->data==NULL)
    printf("List is empty");
   else{
    while(head!=NULL){
        printf("%d\n",head->data);
        head=head->next;
    }
   }
   return 0;
}
