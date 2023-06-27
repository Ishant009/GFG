package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P14_StockBuyAndSell {
    public void stockBuyAndSell(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int profit=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                profit+= arr[i]-arr[i-1];
            }
        }
        System.out.println(profit);
    }

    public static void main(String[] args) {
        P14_StockBuyAndSell p14 = new P14_StockBuyAndSell();
        int[] arr = new int[]{1,5,3,8,12};
        p14.stockBuyAndSell(arr);
    }
}
