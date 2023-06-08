package Arrays;

import java.util.Arrays;

public class P7_ArraySortedOrNot {

    public boolean arraySortedOrNot(int[] arr, int n){
        if ( n==0 || n ==1) return true;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        System.out.println(Arrays.toString(arr));
        return true;
    }
    public static void main(String[] args) {
        P7_ArraySortedOrNot p7 = new P7_ArraySortedOrNot();
        int[] arr = new int[]{20, 20, 78, 98, 99, 97};
        boolean res = p7.arraySortedOrNot(arr, arr.length);
        System.out.println(res);
    }

}
