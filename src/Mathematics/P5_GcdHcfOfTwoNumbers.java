package Mathematics;

public class P5_GcdHcfOfTwoNumbers {
    /*
        Time Complexity for this method is theta(n)
    */
    public int gcdHcfOfTwoNumbers(int num1, int num2){
        int a,b =0;
        int gcd=1;
        if(num1<=num2){
            a=num1;
            b=num2;
        }else{
            a=num2;
            b= num1;
        }
        for(int i=2; i<= a;i++){
            if(a%i==0 && b%i==0){
                gcd= i;
            }
        }
        return gcd;
    }


    public static void main(String[] args) {
        P5_GcdHcfOfTwoNumbers gcdHcfOfTwoNumbers= new P5_GcdHcfOfTwoNumbers();
        int resFact =gcdHcfOfTwoNumbers.gcdHcfOfTwoNumbers(7,14);
        System.out.println(resFact);
    }
}
