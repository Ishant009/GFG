package Mathematics;

public class P4_LCMOfTwoNumbers {
    /*
        Time Complexity for this method is O(a*b-max(a*b))
    */
    public int lcmOfNumbers(int num1, int num2) {
        int mul= num1 * num2;
        for(int i = Math.max(num1 , num2); i<mul;i++){
            if(i%num1 == 0 && i%num2 == 0){
                return i;
            }
        }
        return mul;
    }

    /*
    * using formula a*b= gcd(a,b) * lcm(a,b)
    * its time complexity is  O(log(min(a,b))
    */
    public int lcmOfNumbersEff(int num1, int num2) {
        int res = gcd(num1,num2);
        return (num1*num2)/res;
    }
    public int gcd(int num1, int num2) {
        if(num2 == 0) return num1;
        return gcd(num2, num1%num2);
    }
    public static void main(String[] args) {
        P4_LCMOfTwoNumbers factorialOfNumber= new P4_LCMOfTwoNumbers();
        int resFact =factorialOfNumber.lcmOfNumbers(4,6);
        int resFactEff =factorialOfNumber.lcmOfNumbersEff(4,6);
        System.out.println(resFact);
        System.out.println(resFactEff);
    }
}
