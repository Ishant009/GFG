package Arrays;

import java.util.Arrays;

public class P11_LeaderOfArray {
    // Time Complexity is O(n)
    // auxilary space theta(n)
    public void leaderOfArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int temp[] = new int[arr.length];
        int max = arr[arr.length-1];
        System.out.println(max);
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i]>max){
                System.out.println(arr[i]);
                max = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        P11_LeaderOfArray p10 = new P11_LeaderOfArray();
        int[] arr = new int[]{30,20,10};
        int n=3;
        p10.leaderOfArray(arr);
    }
}
