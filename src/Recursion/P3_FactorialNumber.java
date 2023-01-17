package DataStructureAndAlgorithm_GFG.Recursion;

public class P3_FactorialNumber {

    public int factorial(int num){
        if(num<=0) return 1;
        return num*factorial(num-1);
    }
    public static void main(String[] args){
        P3_FactorialNumber p3= new P3_FactorialNumber();
        int res= p3.factorial(0);
        System.out.println(res);
    }
}
