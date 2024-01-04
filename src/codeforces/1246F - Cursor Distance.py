# def crdict(inp):
#     char_occurrence_dict = {}
#
#     for char in inp:
#         if char in char_occurrence_dict:
#             char_occurrence_dict[char] += 1
#         else:
#             char_occurrence_dict[char] = 1
#
#     return char_occurrence_dict
# a=input()
# summ=0
#
# for i in range(len(a)):
#     if(i!=0):
#         for p in crdict(a[:i]).values():
#             # if(p!=1):
#             print(p," ",int(p*(p+1)/2))
#
#             summ+=int(p*(p+1)/2)
#     if(i+1!=len(a)):
#         for p in crdict(a[i+1:]).values():
#             # if(p!=1):
#             print(p," ",int(p*(p+1)/2))
#             summ+=int(p*(p+1)/2)
#     print(summ," new  ")
# print(summ)
# abacaba
def calculate_distance(s):
    n = len(s)
    total_distance = 0

    for i in range(n):
        for j in range(n):
            distance = 0
            cursor_position = i

            while cursor_position != j:
                target_char = s[j]
                next_occurrence = s[cursor_position:].find(target_char)

                if next_occurrence != -1:
                    cursor_position += next_occurrence
                    distance += next_occurrence
                else:
                    break

            total_distance += distance

    return total_distance

s = input()

result = calculate_distance(s)
print(result)
