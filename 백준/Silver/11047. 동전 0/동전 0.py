N, K = map(int, input().split())
result = 0
coin = []

for i in range(N):
  coin.append(int(input()))

coin.reverse()

for i in coin:
  result += K // i
  K %= i

print(result)