
num=int(input())
flag=int(0)
if num==2:
  print("Prime")
  exit(0)
elif(num > 2): 
  for i in range(2, num):  
      if (num % i) == 0: 
          print("Not Prime") 
          exit(0)
else: 
  print("Not Prime") 
if(flag==0):
  print("Prime")