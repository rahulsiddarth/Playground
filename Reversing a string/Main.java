#include<stdio.h>
void reverse(char *n)
{
  if(*n){
    reverse(n+1);
    printf("%c",*n);
  }
}
int main()
{
  char str[100];
  scanf("%[^\n]s",str);
  reverse(str);
  return 0;
}
    