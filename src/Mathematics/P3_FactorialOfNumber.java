package Mathematics;

public class P3_FactorialOfNumber {
    /*
        Time Complexity for this method is theta(n)
    */
    public int factorialOfNumber(int num){
        int fact= 1;
        while(num>0){
            fact = fact* num;
            num--;
        }
        return fact;
    }

    /*
        Time Complexity for this method is theta(n)
        T(n) =  T(n-1) + theta(1)
        and auxiliary space complexity theta(n)
    */

    public int recursionFactorial(int num){
        if(num <= 0) return 1;
        return num* recursionFactorial(num-1);
    }
    public static void main(String[] args) {
        P3_FactorialOfNumber factorialOfNumber= new P3_FactorialOfNumber();
        int resFact =factorialOfNumber.factorialOfNumber(5);
        int recFact =factorialOfNumber.recursionFactorial(0);
        System.out.println(resFact);
        System.out.println(recFact);
    }
}
