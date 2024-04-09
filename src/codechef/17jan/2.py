# def k(a):
#     s=0
#     for i in a :
#         s*=26
#         s+=ord(i)-96
#     # print(s,a)
#     return s
# q = int(input())
# for w in range(q):
#     x = int(input())
#     y= input()
#     s=26**x
#     minn=y[0]
#     for a in y:
#         e=y.replace(a,"",1)
#         if(k(e)>s):
#             # print(1)
#             minn=a
#         # print(minn)
#     print(y.replace(minn,"",1))

def k(n, s):
    min_char = max(s)
    min_char_index = s.index(min_char)
    return s[:min_char_index] + s[min_char_index + 1:]

t = int(input())

for _ in range(t):
    n = int(input())
    s = input()

    result = k(n, s)
    print(result)
