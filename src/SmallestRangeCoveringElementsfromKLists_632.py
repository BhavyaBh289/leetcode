class Solution(object):
    def smallestRange(self, nums):
        # s=nums[0][0]
        # m=nums[0][0]
        # ma=m
        # for i in nums :
        #     s=min(i[0], s)
        #     m=max(i[0], m)
        #     ma=max(max(i),ma)
        # l=m-s
        # rm=m
        # rs=s
        Queu = []
        cmax = float('-inf')
        for i in range(len(nums)):
            heapq.heappush(Queu, (nums[i][0], i, 0))
            cmax=max(nums[i][0],cmax)
        # print(Queu,cmax)
        sr = [float('-inf'), float('inf')]

        while Queu:
            min_val, l, e = heapq.heappop(Queu)

            if cmax - min_val < sr[1] - sr[0]:
                sr = [min_val, cmax]

            if e + 1 == len(nums[l]):
                break

            next_elem = nums[l][e + 1]
            heapq.heappush(Queu, (next_elem, l, e + 1))

            cmax = max(cmax, next_elem)

        return sr