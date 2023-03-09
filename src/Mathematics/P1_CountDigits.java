package Mathematics;

import java.sql.Time;

public class P1_CountDigits {

/*
    Time Complexity for this method is theta(d)
*/
    public int countDigits(int d){
        int count= 0 ;
        while(d>0){
            count++;
            d=d/10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("hello12");
        P1_CountDigits p1CountDigits= new P1_CountDigits();
        int n =p1CountDigits.countDigits(9235);
        System.out.println(n);
        System.out.println("stopped");
    }
}


