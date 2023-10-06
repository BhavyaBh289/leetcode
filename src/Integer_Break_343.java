public class Integer_Break_343 {
    public int integerBreak(int n) {
        int prod=1;
        if(n==2){
            return 1;
        } else if (n==3) {
            return 2;
        }
        while (n>4){
                if (n>4){
                    n-=3;
                    prod*=3;
                } else if (n==2) {
                    n-=2;
                    prod*=2;
                }
            }
        prod*=n;
        return prod;
    }
    public static void main(String[]args){
        int n =5;
        Integer_Break_343 i = new Integer_Break_343();
        System.out.println(i.integerBreak(n));
    }
}

