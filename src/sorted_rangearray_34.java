import java.util.Arrays;

public class sorted_rangearray_34 {
    public int[] searchRange(int[] nums, int target) {
        int n = Arrays.binarySearch(nums,target);
        if(n<0){
            return new int[]{-1,-1};
        }
        int k = n;
        if(n>0){
            while (nums[k-1]==target){
                k--;
                if (k==0){
                    break;
                }
            }
        }
        if(n!=nums.length-1){
            while (nums[n+1]==target){
                n++;
                if(n==nums.length-1){
                    break;
                }
            }
        }
        return new int[] {k,n};
    }
    public static void main(String[]args){
        int[] nums = new int[]{2,2};
        sorted_rangearray_34 m = new sorted_rangearray_34();
        System.out.println(m.searchRange(nums,2)[1]);
    }
}