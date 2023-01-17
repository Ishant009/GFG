package DataStructureAndAlgorithm_GFG.BitManupulation;

import java.util.ArrayList;
import java.util.List;

public class P3_PowerSetUsingBitwise {

    public void powerSetUsingBitswie(String str) {
        System.out.println(str);
        int n = str.length();
        for (int i = 0; i < Math.pow(2, n); i++) {

            int temp = i;
            String st = "";
            if ((temp & 1) == 1) st = st + "c";
            else st = st + "";
            if (((temp >> 1) & 1) == 1) st = st + "b";
            else st = st + "";
            if (((temp >> 2) & 1) == 1) st = st + "a";
            else st = st + "";
            temp = temp >> 1;
            System.out.println(st);
        }

    }
    public void powerSetUsingBitswieSoln(String str) {
         int n = str.length();
         double size= Math.pow(2,n);
         List<String> res= new ArrayList<>();
         for(int i=0;i<size;i++){
             String st="";
             for(int j=0;j<n;j++){
                 if( (i & (1<<j))!=0) {
                     st = st + str.charAt(j);
                 }
             }
             res.add(st);
         }
        System.out.println(res);
    }
    public static void main(String[] args) {
        P3_PowerSetUsingBitwise p13 = new P3_PowerSetUsingBitwise();
        p13.powerSetUsingBitswieSoln("abc");
    }
}
