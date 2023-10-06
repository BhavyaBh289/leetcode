import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Majority_Element_229 {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer,Integer>();
        for (int i:nums){
            if (hashMap.containsKey(i)){
                hashMap.put(i,hashMap.get(i)+1);
            }else{
                hashMap.put(i,1);
            }
        }
        int n = nums.length/3;
        List<Integer> list=new ArrayList<Integer>();
        for (int i: hashMap.keySet()){
            if(hashMap.get(i)>n){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[]args){
        int[] nums = new int[]{1,2,2,3,9};
        Majority_Element_229 m = new Majority_Element_229();
        List<Integer> n = m.majorityElement(nums);
        for (int i:n){
            System.out.println(i);
        }

    }
}
