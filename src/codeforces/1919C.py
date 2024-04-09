def min_penalty(n, a):
    dp = [float('inf')] * (n + 1)
    dp[0] = 0

    for i in range(1, n + 1):
        for j in range(i):
            penalty = 0
            for k in range(j + 1, i):
                if a[k] < a[k - 1]:
                    penalty += 1
            dp[i] = min(dp[i], dp[j] + penalty)

    return dp[n]

def main():
    t = int(input())
    for _ in range(t):
        n = int(input())
        a = list(map(int, input().split()))
        result = min_penalty(n, a)
        print(result)

if __name__ == "__main__":
    main()
