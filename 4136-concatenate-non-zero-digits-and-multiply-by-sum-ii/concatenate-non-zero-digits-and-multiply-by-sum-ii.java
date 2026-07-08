class Solution {
    static final int MOD = 1_000_000_007;

    public int[] sumAndMultiply(String s, int[][] queries) {

        int n = s.length();

        long[] pow10 = new long[n + 1];
        pow10[0] = 1;

        for (int i = 1; i <= n; i++)
            pow10[i] = (pow10[i - 1] * 10) % MOD;

        int[] cnt = new int[n + 1];
        long[] digitSum = new long[n + 1];
        long[] hash = new long[n + 1];

        for (int i = 0; i < n; i++) {
            cnt[i + 1] = cnt[i];
            digitSum[i + 1] = digitSum[i];
            hash[i + 1] = hash[i];

            int d = s.charAt(i) - '0';

            if (d != 0) {
                cnt[i + 1]++;
                digitSum[i + 1] += d;
                hash[i + 1] = (hash[i] * 10 + d) % MOD;
            }
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int l = queries[i][0];
            int r = queries[i][1];

            int totalDigits = cnt[r + 1] - cnt[l];

            if (totalDigits == 0) {
                ans[i] = 0;
                continue;
            }

            long number =
                    (hash[r + 1]
                    - hash[l] * pow10[totalDigits] % MOD
                    + MOD) % MOD;

            long sum = digitSum[r + 1] - digitSum[l];

            ans[i] = (int) ((number * (sum % MOD)) % MOD);
        }

        return ans;
    }
}