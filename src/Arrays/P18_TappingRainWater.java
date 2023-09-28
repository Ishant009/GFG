package Arrays;

import java.util.Arrays;

public class P18_TappingRainWater {

    /* (Naive Soln)
    Time Compexity : O(n^2)
    *  Auxilary Space : O(1)  */
    public void tappingRainWater(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int res =0;
        for( int i=1 ;i <arr.length-1;i++){
            int lmax= arr[i];
            for(int j=0; j<i;j++){
                lmax = Math.max(lmax, arr[j]);
            }
            int rmax = arr[i];
            for(int j=i+1;j<arr.length;j++){
                rmax = Math.max(rmax, arr[j]);
            }
            res = res + Math.min(lmax, rmax) - arr[i];
        }

        System.out.println(res);
    }

    /* (Optimal Soln)
      Time Compexity : O(n)
      Auxilary Space : O(1)  */
    public void tappingRainWater1(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int res =0;
        int n = arr.length;
        int lmaxArr[] = new int[n];
        int rmaxArr[] = new int[n];
        lmaxArr[0] =  arr[0];
        for(int i=1;i<n;i++){
            lmaxArr[i] =  Math.max(arr[i], lmaxArr[i-1]);
        }
        rmaxArr[n-1] = arr[n-2+1];
        for(int i=n-2;i>=0;i--){
            rmaxArr[i] = Math.max(rmaxArr[i+1],arr[i]);
        }
        for(int i=0;i<n ; i++){
            res =  res + Math.min(lmaxArr[i],rmaxArr[i])-arr[i];
        }
        System.out.println(res);
    }


    public static void main(String[] args) {
        P18_TappingRainWater p18 = new P18_TappingRainWater();
        int[] arr = new int[]{5,0,6,2,3};
        p18.tappingRainWater1(arr);
    }
}
