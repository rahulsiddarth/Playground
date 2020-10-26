def SumNumbersDivisible(m,n):
  n=int(n//15)
  n=int((n*(n+1))/2)
  m=int(m//15)
  m=int((m*(m+1))/2)
  return (n-m)*15

m=int(input())
n=int(input())
if(m>=n):
  print(0)
else:  
  print(SumNumbersDivisible(m-1,n-1))