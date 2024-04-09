import java.util.Arrays;

public class blooming_flowers_2251 {
    public int[] fullBlomFlowers(int[][] flowers, int[] people) {
        int max =0;
        for (int []i :flowers){
            max = Math.max(max,i[1]);
        }
        int[] ripe= new int[max];
        for(int []k :flowers){
            for (int i = k[0];i<=k[1];i++){
                ripe[i-1]++;
            }
        }
//        for(int i :ripe){
//            System.out.println(i);
//        }
        int []res = new int[people.length];
        for (int i=0;i<people.length;i++){
//            System.out.println(i+" "+people[i]+" "+ripe[people[i]-1]);
            if(people[i]>ripe.length) {
                res[i] = 0;
            }else {
                res[i]=ripe[people[i]-1];
            }
        }
        return res;
    }
    public int[] fullBloomFlwers(int[][] flowers, int[] people) {
        int [] res = new int[people.length];
        for (int i=0;i<people.length;i++){
            for (int[] k:flowers){
                if(people[i]>=k[0] &&people[i]<=k[1]){
                    res[i]++;
                }
            }
        }
        return res;
    }
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int[]start=new int[flowers.length],end=new int[flowers.length];
        for (int k=0;k<flowers.length;k++){
            start[k]=flowers[k][0];
            end[k]=flowers[k][1];
        }
        Arrays.sort(end);
        Arrays.sort(start);
        for(int i :start){
            System.out.println(i);
        }
        for(int i :end){
            System.out.println(i);
        }
        int[]res=new int[people.length];
        for (int k=0;k<people.length;k++){
            System.out.println(bsf(start,people[k])+" "+bsl(end,people[k]));
            res[k]=bsf(start,people[k])-bsl(end,people[k]);
        }
        return res;
    }
    private int bsf(int[]array,int target){
        int k = Arrays.binarySearch(array,target);
        System.out.println(k);
        
        if(k>0){
            while(array[k-1]==target & k>0){
                k--;
            }
        }
        return k;
    }

    private int bsl(int[]array,int target){
        int k = array.length/2;
        while
        return k;
    }
    public static void main(String[]args){
        int[][] flowers = new int[][]{{1,6},{3,7},{9,12},{4,13}};
        int [] poeple = new  int[]{2,3,7,11};
        blooming_flowers_2251 b = new blooming_flowers_2251();
        for (int i: b.fullBloomFlowers(flowers,poeple)){
//            System.out.println(i);
        }
    }
}
