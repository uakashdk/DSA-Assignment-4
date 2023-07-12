class Solution {
    public int arrangeCoins(int n) {
        int lo = 1, hi = n, mid;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (mid * (mid + 1L) <= n * 2L) lo = mid + 1;
            else hi = mid - 1;
        }
        return hi;
    }
}