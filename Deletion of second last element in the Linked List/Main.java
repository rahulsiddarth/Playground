#include <stdio.h>
#include <stdlib.h>
struct node{
  int data;
  struct node* next;
};
int main()
{
  struct node *head,*newnode,*ptr;
  int temp=0,cnt=0;
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
        cnt++;
      }
      else{
        ptr->next=newnode;
        ptr=ptr->next;
        cnt++;
      }
    }
    else{
      
      if(cnt>1){
       // printf("%d",head->data);
       cnt -= 2;
      do{
         printf("%d ",head->data);
         head=head->next;
         --cnt;
         } while(cnt);
        newnode=head;
        head->next=ptr;
        free(newnode);
        head=head->next;
        printf("%d ",head->data);
      }
      else{printf("Deletion of second last element is not possible");
      }
    }
  }while(temp>0);
   return 0;
}