package DataStructureAndAlgorithm_GFG.Arrays;

import java.util.Arrays;

public class P5_ReverseArray {

    public void reverse(int[] arr){
        int i=0,j= arr.length-1;
        while(i<j){
            arr[i]=arr[i]^arr[j];
            arr[j]=arr[i]^arr[j];
            arr[i]=arr[i]^arr[j];
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        P5_ReverseArray p5= new P5_ReverseArray();
        int[] arr = new int[]{100,20,200,300};
        p5.reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
