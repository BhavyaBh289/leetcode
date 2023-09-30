public class two_sum_1 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,3,9};
        int [] res = twoSum(nums,5);
        System.out.println(res.toString());

    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0;i<nums.length;i++){
            for (int j = 0;j<i;j++){
                if (nums[i]+nums[j]==target){
                    int [] res = new int[]{i,j};
                    return res;
                }
            }
        }
        int[] r= new int[]{};
        return r;
    }
}
