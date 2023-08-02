import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
         int a1 = intervals[0][0];
        int b1 = intervals[0][1];
        int a2 = intervals[1][0];
        int b2 = intervals[1][1];
        int[] arr1, arr2 = new int[arr.length];
        arr1 = Arrays.copyOfRange(arr, a1, b1+1);
        arr2 = Arrays.copyOfRange(arr, a2, b2+1);
        int[] answer = new int[arr1.length + arr2.length];
        System.arraycopy(arr1,0,answer,0,arr1.length);
        System.arraycopy(arr2,0,answer,arr1.length,arr2.length);
   
        
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2));
        return answer;
    }
}