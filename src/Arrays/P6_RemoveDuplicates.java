package DataStructureAndAlgorithm_GFG.Arrays;

import java.util.Arrays;

public class P6_RemoveDuplicates {

    public void removeDuplicate(int[] arr) {
        int[] newarr = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (newarr[j] != arr[i]) {
                newarr[j] = arr[i];
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(newarr));
    }

    public void removeDupicate1(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[j]!=arr[i]){
                j++;
                arr[j]=arr[i];

            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        P6_RemoveDuplicates p6 = new P6_RemoveDuplicates();
        int[] arr = new int[]{10,10,10,40,40, 20, 20,20, 30, 30, 30};
        p6.removeDupicate1(arr);
    }

}
