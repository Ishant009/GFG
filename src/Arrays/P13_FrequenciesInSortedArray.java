package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P13_FrequenciesInSortedArray {
    // Time Complexity is O(n)
    // auxilary space theta(n)
    public void frequenciesInSortedArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
        Map<Integer,Integer> map= new HashMap<>();
        for(int ele:arr){
            if(map.containsKey(ele)){
                map.put(ele, map.get(ele)+1);
            }else{
                map.put(ele,1);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        P13_FrequenciesInSortedArray p13 = new P13_FrequenciesInSortedArray();
        int[] arr = new int[]{10,10,10,25 ,30,30};
        p13.frequenciesInSortedArray(arr);
    }
}
