package Arrays;

import java.util.Arrays;

public class P9_RotateArrayByOne {

    // Time Complexity is O(n)
    public void rotateArrayByOne(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int temp = arr[0];
        for(int i=0;i<arr.length -1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        P9_RotateArrayByOne p9 = new P9_RotateArrayByOne();
        int[] arr = new int[]{1,2,3,4,5};
        p9.rotateArrayByOne(arr);
    }

}
