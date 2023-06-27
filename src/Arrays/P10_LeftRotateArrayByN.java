package Arrays;

import java.util.Arrays;

public class P10_LeftRotateArrayByN {
    // Time Complexity is O(n)
    // auxilary space theta(n)
    public void leftRotateArrayByN(int[] arr,int n) {
        System.out.println(Arrays.toString(arr));
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[i];
        }
        int j=0;
        for(;n<arr.length;n++){
            arr[j++]=arr[n];
        }
        int k =0;
        for(;j<arr.length;j++){
            arr[j]=temp[k++];
        }
        System.out.println(Arrays.toString(arr));
    }

    public void leftRotateArrayByReversal(int[] arr, int n){
        System.out.println(Arrays.toString(arr));
        reverse(arr, 0 ,n-1);
        reverse(arr,n,arr.length-1);
        reverse(arr,0,arr.length-1);
        System.out.println("result : "+Arrays.toString(arr));
    }
    public void reverse(int[] arr, int a, int b){
        while(a<b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;b--;
        }
    }
    public static void main(String[] args) {
        P10_LeftRotateArrayByN p10 = new P10_LeftRotateArrayByN();
        int[] arr = new int[]{10,5,30,15};
        int n=3;
        p10.leftRotateArrayByReversal(arr,n);
    }
}
