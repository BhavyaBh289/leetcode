public class monotonic_array_896 {
    public static boolean isMonotonic(int[] nums) {
        boolean inc ;
        int a=0,b=1;
        if(nums.length<2){
            return true;
        }
        while(nums[a] == nums[b] ){
            if (b>=nums.length-1){
                break;
            }
            a++;b++;
        }
        inc = nums[a] < nums[b] ;
        for(int i=0;i<nums.length-1;i++){
            if (inc){
                if(nums[i]>nums[i+1]){
                    return false;
                }
            }
            else {
                if(nums[i]< nums[i+1]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,3,9};
        if(isMonotonic(nums)){
            System.out.println(1);
        }
    }
}
