class Solution {
    public boolean validMountainArray(int[] A) {
        if(A.length<=0)
            return false;
        int left=0,right=A.length-1;
        while (left + 1 < A.length && A[left] < A[left + 1])
            left++;
        //从右边往左边找，一直找到山峰为止
        while (right > 0 && A[right - 1] > A[right])
            right--;
        //判断从左边和从右边找的山峰是不是同一个
        return left > 0 && right < A.length - 1 && left == right;
    }
}