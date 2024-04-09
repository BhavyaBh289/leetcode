def min_penalty_memoization(n, s, memo):
    if n == 0:
        return 0

    if memo[n] != -1:
        return memo[n]

    total_sum = 0
    min_pen = float('inf')

    for i in range(n, 0, -1):
        total_sum += 1 if s[i - 1] == '+' else -1
        min_pen = min(min_pen, min_penalty_memoization(i - 1, s, memo) + abs(total_sum) * (n - i + 1))

    memo[n] = min_pen
    return min_pen

def min_penalty(n, s):
    memo = [-1] * (n + 1)
    return min_penalty_memoization(n, s, memo)

t = int(input())
for _ in range(t):
    n = int(input())
    s = input()
    result = min_penalty(n, s)
    print(result)

