package Arrays;

import java.util.Arrays;

public class P8_MoveZeroToEnd {

    // Time Complexity is O(n)
    public void moveZeroToEnd(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[k++]=arr[i];
            }
        }
        while(k<arr.length){
            arr[k++] =0;
        }
        System.out.println(Arrays.toString(arr));
    }

    // Time Complexity O(n)
    public void moveZeroToEndUsingSwap(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i] =0;
                arr[k]=temp;
                k++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        P8_MoveZeroToEnd p8 = new P8_MoveZeroToEnd();
        int[] arr = new int[]{8,5,0,10,0,20};
        p8.moveZeroToEndUsingSwap(arr);
    }

}
