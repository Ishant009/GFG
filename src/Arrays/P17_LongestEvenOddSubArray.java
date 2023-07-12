package Arrays;

import java.util.Arrays;

public class P17_LongestEvenOddSubArray {

    /* my soln:-
    Time Compexity : O(n)
    * Auxilary Space : O(1)*/
    public void longestEvenOddSubArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int counter =0;
        int maxCounter =0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]%2==0 && arr[i+1]%2!=0){
                if(arr[i+1]==arr[arr.length-1]){
                    counter++;
                }
                counter++;
                maxCounter = Math.max(counter,maxCounter);
            }else if(arr[i]%2!=0 && arr[i+1]%2==0){
                if(arr[i+1]==arr[arr.length-1]){
                    counter++;
                }
                counter++;
                maxCounter = Math.max(counter,maxCounter);
            }else{
                counter =0;
            }
        }
        maxCounter = (arr.length>0)?Math.max(counter, 1):0;
        System.out.println(maxCounter);
    }

    public void longestEvenOddSubArrayRes(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int res =1;
        int curr =1;
        for(int i=1;i<arr.length;i++){
            if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i+1]%2==0)){
                curr++;
                res = Math.max(res,curr);
            }else{
                curr=1;
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        P17_LongestEvenOddSubArray p17 = new P17_LongestEvenOddSubArray();
        int[] arr = new int[]{10,12,14,7,8};
        p17.longestEvenOddSubArrayRes(arr);
    }
}
