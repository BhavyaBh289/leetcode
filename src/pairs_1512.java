public class pairs_1512 {
    public int numIdenticalPairs(int[] nums) {
        int res=0;
        for (int i = 0;i<nums.length;i++){
            for (int j = 0;j<i;j++){
                if(nums[i]==nums[j]){
                    res+=1;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,3,9};
        pairs_1512 t = new pairs_1512() ;
        int res = t.numIdenticalPairs(nums);
        System.out.println(res);

    }
}
