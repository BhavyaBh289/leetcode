def find_winner(a, b):
    if (a + b) % 2 == 0:
        return "Bob"
    else:
        return "Alice"

t = int(input())
for _ in range(t):
    a, b = map(int, input().split())
    result = find_winner(a, b)
    print(result)

