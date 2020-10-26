#include<iostream>
using namespace std;
int arr[1000],front=-1,rear=-1;
void push(int n){
  int num;
  for(int i=0;i<n;i++){
    cin>>num;
  if(front==-1){
  front++;
    arr[front]=num;
  }
    else{
      front++;
    arr[front]=num;
    }
  }
}
void display(int n,int end,int start){
  cout<<"Stack "<<n<<" Elements:"<<endl;
for(int i=end;i>=start;i--){
  cout<<arr[i]<<" ";
}
  cout<<"\n";
}
void pop(int temp,int popCount,int e_index,int s_index){
  if(s_index+popCount>e_index){
    cout<<"Stack underflow. pop from stack "<<temp<<" failed"<<endl;
    cout<<"Stack "<<temp<<" Elements:"<<endl;
    cout<<"\n";
    return;
  }
  display(temp,e_index-popCount-1,s_index);
}

int main()
{
  int size1,size2,pop1,pop2;
  cin>>size1;
  push(size1);
  display(1,size1-1,0);
  cin>>size2;
  push(size2);
  display(2,size1+size2-1,size1);
  
  cin>>pop1;
  pop(1,pop1,size1,0);
  cin>>pop2;
  pop(2,pop2,size1+size2,size1);
  
  return 0;
}