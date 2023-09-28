package BitManupulation;

import java.util.Arrays;

public class P4_OneOddOccuring {

/*    Time Complexity : theta(n)
      Space Complexity: O(1)
*/
    public void oneOddOccuring(int[] arr){
        System.out.println(Arrays.toString(arr));
        int number=0;
        for(int i: arr){
            number = number ^ i;
        }
        System.out.println(number);

    }
    public static void main(String[] args){
        P4_OneOddOccuring p4= new P4_OneOddOccuring();
        int[] arr1 = new int[]{4,3,4,4,4,5,5};
        int[] arr2 = new int[]{8,7,7,8,8};
        int[] arr3 = new int[]{3,4,3,4,5,4,4,6,7,7};
        p4.oneOddOccuring(arr3);
    }
}
