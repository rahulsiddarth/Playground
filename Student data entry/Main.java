#include <iostream>
#include <string>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
}s1;
int main() 
{
   //Your code goes here
  gets(s1.name);
  cin>>s1.roll;
  cin>>s1.marks;
  cout<<"\nStudent Details\n";
  cout<<"Name: "<<s1.name<<endl;
  cout<<"Roll: "<<s1.roll<<endl;
  cout<<"Marks: "<<s1.marks;
}