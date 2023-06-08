package Arrays;

import java.util.Arrays;

public class SP1_RangeSum {
    int[] prefix = new int[5];
    boolean isPresent = false;
    public void setPrefix(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            prefix[i] = sum;
            isPresent = true;
        }
    }

    public int rangeSum(int[] arr, int l, int r){
        if(!isPresent){
            setPrefix(arr);
        }
        System.out.println(Arrays.toString(prefix));
        if(l==0) {
            return prefix[r];
        }else{
            return prefix[r] - prefix[l-1];
        }
    }
    public static void main(String[] args) {
        SP1_RangeSum sp1= new SP1_RangeSum();
        int[] arr= {4,5,3,2,5};
        int a = sp1.rangeSum(arr,0,3);
        int b = sp1.rangeSum(arr, 2, 4);
        int c = sp1.rangeSum(arr, 1, 3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
