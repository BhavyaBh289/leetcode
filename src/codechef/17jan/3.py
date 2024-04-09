q = int(input())
for w in range(q):
    x = [int(s) for s in input().split()]
    hgun=x[0]//x[1]
    hla=0
    if x[0]%x[1]!=0:
        hgun+=1
    if(x[0]//x[2]<x[4]):
        hla=x[0]//x[2]
        print(x[0]//x[2]," ",x[0]%x[2])
        if x[0]%x[2]!=0:
            hla=hla+1
    else:
        hla=((x[0]-x[2]*x[4])//x[3])+x[4]
        if ((x[0]-x[2]*x[4])%x[3]!=0):
            hla+=1
    print(min(hla,hgun))
