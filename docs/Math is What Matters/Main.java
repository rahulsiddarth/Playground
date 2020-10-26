num = int(input())
summ = 0
temp = num
while(temp > 0):
    digit = temp % 10
    summ += digit ** len(str(num))
    temp //= 10
if(num==summ):
  print("Yes")
else:
  print("No")