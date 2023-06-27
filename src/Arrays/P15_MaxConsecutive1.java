package Arrays;

import java.util.Arrays;

public class P15_MaxConsecutive1 {

    /*Time Compexity : O(n)
    * Auxilary Space : O(1)*/
    public void maxConsecutive1(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int max=0;
        int counter=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1) {
                counter++;
                max = Math.max(max,counter);
            }else{
                counter=0;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        P15_MaxConsecutive1 p15 = new P15_MaxConsecutive1();
        int[] arr = new int[]{0,1,1,0,1,1,1};
        p15.maxConsecutive1(arr);
    }
}
