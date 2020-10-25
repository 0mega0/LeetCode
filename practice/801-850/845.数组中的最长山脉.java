class Solution {
    public int longestMountain(int[] A) {
        int n = A.length;
        int ans = 0;
        int left = 0;
        while (left + 2 < n) {
            int right = left + 1;
            if (A[left] < A[left + 1]) {
                while (right + 1 < n && A[right] < A[right + 1]) {
                    ++right;
                }
                if (right < n - 1 && A[right] > A[right + 1]) {
                    while (right + 1 < n && A[right] > A[right + 1]) {
                        ++right;
                    }
                    ans = Math.max(ans, right - left + 1);
                } else {
                    ++right;
                }
            }
            left = right;
        }
        return ans;
    }
}
//class Solution {
//     public static int longestMountain(int[] A) {
//         if(A.length<3)return 0;
//         int leftIndex=0;
//         int rightIndex=0;
//         int highest=0;
//         boolean isStarted=false;
//         boolean isLow=false;
//         int i=0;
//         while(i < A.length){
//             //如果还未开始,则执行判定"启动"if语句
//             if(!isStarted && A[leftIndex] < A[i] ){
//                 leftIndex = i-1;
//                 rightIndex = i;
//                 isStarted = true;
//                 i++;
//                 continue;
//             }
//             //如果已经开始,则寻找山峰
//             if(isStarted && !isLow && A[i] > A[rightIndex]){
//                 rightIndex = i;
//                 i++;
//                 continue;
//             }else if(isStarted && !isLow && A[i] < A[rightIndex]){
//                 rightIndex = i;
//                 i++;
//                 isLow=true;
//                 continue;
//             }
//             if(isStarted && isLow && A[i] < A[rightIndex]){
//                 rightIndex = i;
//                 i++;
//                 continue;
//             }
//             isStarted=false;
//             isLow=false;
//             highest = rightIndex - leftIndex + 1;
//             i++;
//             leftIndex=i-1;
//             //System.out.println(i +"次：左边=" + leftIndex + "右边=" + rightIndex );
//         }
//         if ( (rightIndex - leftIndex + 1) > highest ) highest = rightIndex - leftIndex + 1;
//         return highest;
//     }
// }