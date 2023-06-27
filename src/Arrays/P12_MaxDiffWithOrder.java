package Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class P12_MaxDiffWithOrder {
    // Time Complexity is O(n)
    // auxilary space theta(n)
    public void maxDiffWithOrder(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int maxDiff = Integer.MIN_VALUE;
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            maxDiff = Math.max(maxDiff, arr[i]-min);
            min =  Math.min(arr[i],min);
        }
        System.out.println("Max Difference : = " + maxDiff);
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        P12_MaxDiffWithOrder p12 = new P12_MaxDiffWithOrder();
        int[] arr = new int[]{2,3,10,6 ,4,8 ,1};
        p12.maxDiffWithOrder(arr);
    }
}
