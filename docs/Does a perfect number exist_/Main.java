n=int(input())
summ=int(0)
div=set()
a=int(n**0.5)+1
for i in range(1,a+1):
  if(n%i==0):
    div.add(i)
    div.add(int(n/i))
div.remove(n)
if(sum(div)==n):
  print("Yes")
else:
  print("No")