package Mathematics;

public class P4_TrailingZerosInFactorial {
    /*
        Time Complexity for this method is theta(n)
    */
    public int countTrailingZerosNaiveMethod(int num){
        int fact= 1;
        int count =0;
        while(num>0){
            fact = fact* num;
            num--;
        }
        while(fact>0){
            if(fact%10==0){
                count++;
                fact = fact/10;
            }else{
                return count;
            }
        }
        return count;
    }

    /*
       Time Complexity for this method is log(n)
       5^k <= n
       k = log5(n)
   */
    int countTrailingZeros(int n){

        int res=0;
        for(int i=5;i<=n; i=i*5){
            res = res + n/i;
        }
        return res;

    }

    public static void main(String[] args) {
        P4_TrailingZerosInFactorial factorialOfNumber= new P4_TrailingZerosInFactorial();
        int resFact =factorialOfNumber.countTrailingZerosNaiveMethod(10);
        int resFactorial =factorialOfNumber.countTrailingZeros(9);
        System.out.println(resFact);
        System.out.println(resFactorial);
    }
}
