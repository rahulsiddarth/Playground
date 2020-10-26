sum1=int(0)
sum2=int(0)
n=int(input())
for i in range(0,int(len(str(n))/2)):
    sum1=sum1+(n%10)
    n=int(n/10)
    sum2=sum2+(n%10)
    n=int(n/10)
if(len(str(n))%2!=0):
  sum1=sum1+(n%10) 
print(sum1-sum2)