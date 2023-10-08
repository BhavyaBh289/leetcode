import java.util.Arrays;
import java.util.List;

public class Max_dot_product_1458 {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] current = new int[n + 1], previous = new int[n + 1];
        Arrays.fill(current, -5);
        Arrays.fill(previous, -5);

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int curr_product = nums1[i - 1] * nums2[j - 1];
                current[j] = Math.max(Math.max(Math.max(curr_product, previous[j]), current[j - 1]), curr_product + Math.max(0, previous[j - 1]));
            }
            int[] temp = current;
            current = previous;
            previous = temp;
        }
        return previous[n];
    }
    public static void main(String[]args){
        int[] nums = new int[]{1,2,2,3,9};
        Max_dot_product_1458 m = new Max_dot_product_1458();
        System.out.println(m.maxDotProduct(nums,nums));
    }
}