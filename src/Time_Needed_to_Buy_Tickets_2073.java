class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int sum=0;
        int full=0;
        int t = tickets[k];
        for (int i =0;i<tickets.length;i++){
            if(tickets[i]>=t){
                full+=1;
                if(k<i){
                    sum-=1;
                }
            }else{
                sum+=tickets[i];
            }

        }
        sum+=full*t;
        return sum;
    }
}
