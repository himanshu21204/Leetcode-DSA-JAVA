class Solution {
    static final int MOD = 1000000007;
    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;

        long evenAns = ans(5,even);
        long oddAns = ans(4,odd);

        return (int)((evenAns * oddAns) % MOD);
    }
    long ans(long x,long n){
        if (n == 0) {
            return 1;
        }
        long halfPower = ans(x, n / 2);
        if (n % 2 == 0) {
            return (halfPower * halfPower) % MOD;
        } else {
            return (halfPower * halfPower * x) % MOD;
        }
    }
}