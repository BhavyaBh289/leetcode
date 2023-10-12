public class palindrome_9 {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        if (x<10){
            return true;
        }
        int n = x,k=0;
        int[] t=new int[20];
        while (n>=1){
            t[k]=n%10;
            n/=10;
            k++;
        }

        for (int i = 0;i<k;i++){
            if(t[i]!=t[k-i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String []args){
        int n = 101101;
        palindrome_9 p = new palindrome_9();
        System.out.println(p.isPalindrome(n));
    }
}
