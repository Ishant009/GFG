package Mathematics;

public class P5_PrimeNumber {
    /*
        Time Complexity for this method is O(sqrt(n))
    */
    public boolean prime(int num1) {
        for(int i=2 ; i<=Math.sqrt(num1); i++){
            if(num1%i==0) return false;
        }
        return true;
    }

    public boolean primeEff(int num1) {
        if(num1==1) return false;
        if(num1==2 || num1==3) return true;
        if(num1%2 ==0 || num1%3 ==0) return false;
        for(int i=5 ; i<=Math.sqrt(num1); i=i+6){
            if(num1%i==0 || num1%(i+2)==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        P5_PrimeNumber primeNumber= new P5_PrimeNumber();
        boolean resFact =primeNumber.prime(9);
        System.out.println(resFact);
    }
}
