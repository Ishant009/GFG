package Mathematics;

public class P6_DivisorOfNumber {

    /*
    * Time Complexity : O(n)
    * */
    public void divisor(int num1) {
        for(int i=1; i<=num1; i++){
            if(num1%i ==0){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
    /*
     * Time Complexity : O(log(n))
     * */
    public void divisorEfficient(int n) {
        for (int i = 1; i * i <= n; i++){
            if(n%i == 0){
                int n2 = n/i;
                System.out.print(i + " ");
                if (i != n2){
                    System.out.print(n / i + " ");
                }
            }

        }
    }
    public static void main(String[] args) {
        P6_DivisorOfNumber divisorOfNumbers= new P6_DivisorOfNumber();
        divisorOfNumbers.divisor(100);
        System.out.println("+++++++++++++++++++");
        divisorOfNumbers.divisorEfficient(100);
    }
}
