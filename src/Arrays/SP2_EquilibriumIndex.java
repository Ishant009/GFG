package Arrays;

import java.util.Arrays;

public class SP2_EquilibriumIndex {
    int[] prefix = new int[5];
    boolean isPresent = false;
    public int equilibriumIndex(int[] arr){
        System.out.println(Arrays.toString(arr));
        int sum =0;
        int leftSum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        for(int i=0;i<arr.length;i++){
            if(sum==leftSum){
                return i;
            }else{
                sum = sum - arr[i];
                leftSum = arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        SP2_EquilibriumIndex sp2= new SP2_EquilibriumIndex();
        int[] arr={-7, 1, 5, 2, -4, 3, 0};
        int a = sp2.equilibriumIndex(arr);
        System.out.println(a);

    }
}
