class Solution {
    public int[] sortedSquares(int[] A) {
    int n = A.length;
    int[] res = new int[n];
    int index = n - 1;
    int l = 0, r = n - 1;
    while (l <= r) {
        if (Math.abs(A[l]) < Math.abs(A[r])) {
            res[index--] = A[r] * A[r];
            r--;
        } else {
            res[index--] = A[l] * A[l];
            l++;
        }
    }
    return res;
}
}