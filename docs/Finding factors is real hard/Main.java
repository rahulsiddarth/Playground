n=int(input())
li=set()
for i in range(1,int(n**0.5)+2):
    if(n%i==0):
      li.add(int(n/i))
      li.add(i)
le=list(sorted(li))
print(*le)