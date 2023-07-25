package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P19_MajorityElement {

    /* (Optimal Soln)
    Time Compexity : O(n^2)
    *  Auxilary Space : O(1)  */
    public void majorityElement(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
            if(map.get(arr[i])>arr.length/2){
                res= i;
                break;
            }
        }
        System.out.println(arr[res]);
    }


    public static void main(String[] args) {
        P19_MajorityElement p18 = new P19_MajorityElement();
        int[] arr = new int[]{8,3,4,8,8};
        p18.majorityElement(arr);
    }
}
