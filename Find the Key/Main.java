n1=int(input())
n2=int(input())
n3=int(input())
li=list()
if(n1%10>=n2%10 and n1%10>=n3%10):
  li.append(n1%10)
elif(n2%10>=n3%10):
  li.append(n2%10)
else:
  li.append(n3%10)
n1,n2,n3=int(n1/10),int(n2/10),int(n3/10)
if(n1%10<=n2%10 and n1%10<=n3%10):
  li.append(n1%10)
elif(n2%10<=n3%10):
  li.append(n2%10)
else:
  li.append(n3%10)
n1,n2,n3=int(n1/10),int(n2/10),int(n3/10)
if(n1%10>=n2%10 and n1%10>=n3%10):
  li.append(n1%10)
elif(n2%10>=n3%10):
  li.append(n2%10)
else:
  li.append(n3%10)
n1,n2,n3=int(n1/10),int(n2/10),int(n3/10)
if(n1%10<=n2%10 and n1%10<=n3%10):
  li.append(n1%10)
elif(n2%10<=n3%10):
  li.append(n2%10)
else:
  li.append(n3%10)
for i in range(3,-1,-1):
  print(li[i],end="")