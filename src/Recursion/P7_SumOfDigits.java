package DataStructureAndAlgorithm_GFG.Recursion;

public class P7_SumOfDigits {

    public int sumOfDigits(int num){
        if(num<=0) return num;
        return num%10 + sumOfDigits(num/10);
    }
    public static void main(String[] args){
        P7_SumOfDigits p7= new P7_SumOfDigits();
        int sum= p7.sumOfDigits(10);
        System.out.println(sum);
    }
}

/* TimeCompexity : t(D) D=no of digits. */