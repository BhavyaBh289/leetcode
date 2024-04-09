def construct_tree(n, states):
    edges = []
    for i in range(n):
        for j in range(n):
            if states[i][j] == '1':
                # Check if vertex i can be the parent of vertex j
                valid = True
                for k in range(n):
                    if k != i and states[k][j] == '1':
                        valid = False
                        break
                if valid:
                    edges.append((i + 1, j + 1))

    return edges

def check_tree(n, edges):
    children_count = [0] * (n + 1)

    for u, v in edges:
        children_count[u] += 1

    for i in range(1, n + 1):
        if children_count[i] == 0 or children_count[i] == 1:
            continue
        else:
            return False

    return True

def main():
    n = int(input())
    states = [input().strip() for _ in range(n)]

    edges = construct_tree(n, states)

    if check_tree(n, edges):
        print("YES")
        for edge in edges:
            print(*edge)
    else:
        print("NO")

if __name__ == "__main__":
    main()
