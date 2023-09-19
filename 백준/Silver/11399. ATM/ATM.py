n = int(input())
sum = 0
result = 0

t = list(map(int, input().split()))

t.sort()

for i in range(n):
  sum = 0
  for j in range(i + 1):
    sum += t[j]
  result += sum

print(result)