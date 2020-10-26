#GCD
def computeGCD(x, y):
  while(y): 
     x, y = y, x % y 
  print(x) 
l,h=map(int,input().split())
"""for i in range(l,0,-1):
  if(h%i==0):
    print(i)
    exit(0)"""
computeGCD(h,l)