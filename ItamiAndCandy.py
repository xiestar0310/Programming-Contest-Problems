def sieve(n):
  size = n//2
  primes = [1]*size
  limit = int(n**0.5)
  for i in range(1,limit):
    if primes[i]:
      val = 2*i+1
      tmp = ((size-1) - i)//val 
      primes[i+val::val] = [0]*tmp
  if n > 2:
    return [2] + [i*2+1 for i, v in enumerate(primes) if v and i>0]
  else:
    return []
      
N,x = map(int,input().split())
total = 0

primes = sieve(N+1)

for i in range(len(primes)):
  if N-primes[i] == 0:
    total += 1
  else:
    total += int((N-primes[i])/x) + 1
    total += int((N-primes[i]-1)/x) + 1

print (total)
