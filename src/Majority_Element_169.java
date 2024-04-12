class Solution {
    public int majorityElement(int[] nums) {
        Random r = new Random();
        int c = nums[r.nextInt(nums.length)];
        int t = 0;
        while(t<(nums.length/2+nums.length%2)){
            c = nums[r.nextInt(nums.length)];
            t = 0;
            for (int i :nums){
                if(i==c){
                    t+=1;
                }
            }
        }
        return c ;
    }
}