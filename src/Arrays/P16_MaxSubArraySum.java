package Arrays;

import java.util.Arrays;

public class P16_MaxSubArraySum {

    /*Time Compexity : O(n)
    * Auxilary Space : O(1)*/
    public void maxSubArraySum(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int maxSum=arr[0];
        int sum =arr[0];
        for(int i=1;i< arr.length;i++){
//            sum += arr[i];
            sum = Math.max(sum + arr[i],arr[i]);
            maxSum = Math.max(sum, maxSum);
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        P16_MaxSubArraySum p16 = new P16_MaxSubArraySum();
        int[] arr = new int[]{-6,-1,-3};
        p16.maxSubArraySum(arr);
    }
}
