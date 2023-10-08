import java.util.List;

public class KComparisions_1420 {

    public int numOfArrays(int n, int m, int k) {
        final int kMod = 1_000_000_007;
        int[][][] dp = new int[n + 1][m + 1][k + 1];

        for (int j = 1; j <= m; ++j)
            dp[1][j][1] = 1;

        for (int i = 2; i <= n; ++i)
            for (int j = 1; j <= m; ++j)
                for (int t = 1; t <= k; ++t) {
                    dp[i][j][t] = (int) ((long) j * dp[i - 1][j][t] % kMod);
                    for (int prevMax = 1; prevMax < j; ++prevMax) {
                        dp[i][j][t] += dp[i - 1][prevMax][t - 1];
                        dp[i][j][t] %= kMod;
                    }
                }

        int ans = 0;
        for (int j = 1; j <= m; ++j) {
            ans += dp[n][j][k];
            ans %= kMod;
        }
        return ans;
    }
    public static void main(String[]args){
        KComparisions_1420 k = new KComparisions_1420();
        System.out.println(k.numOfArrays(3,5,7));
    }

}