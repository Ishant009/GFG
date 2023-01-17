package DataStructureAndAlgorithm_GFG.Recursion;

public class P4_FibonacciNumber {

    public int fibonacciNumber(int num){
        if(num<= 1) return num;
        return fibonacciNumber(num-1)+ fibonacciNumber(num-2);
    }
    public static void main(String[] args){
        P4_FibonacciNumber p4= new P4_FibonacciNumber();
        int res= p4.fibonacciNumber(0);
        System.out.println(res);
    }
}
